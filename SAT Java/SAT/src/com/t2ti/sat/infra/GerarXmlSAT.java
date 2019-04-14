/*
 * The MIT License
 * 
 * Copyright: Copyright (C) 2014 T2Ti.COM
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * The author may be contacted at: t2ti.com@gmail.com
 *
 * @author Claudio de Barros (T2Ti.com)
 * @version 2.0
 */
package com.t2ti.sat.infra;

import br.gov.sp.fazenda.sat.cferecepcao.EnvCFe.LoteCFe.CFe;
import br.gov.sp.fazenda.sat.cferecepcao.ObjectFactory;
import com.t2ti.nfce.infra.SessaoUsuario;
import com.t2tierp.cadastros.java.EmpresaVO;
import com.t2tierp.nfe.java.NfeCabecalhoVO;
import com.t2tierp.nfe.java.NfeDestinatarioVO;
import com.t2tierp.nfe.java.NfeDetalheVO;
import com.t2tierp.nfe.java.NfeFormaPagamentoVO;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

public class GerarXmlSAT {

    public String gerarXmlEnvio(EmpresaVO empresa, NfeCabecalhoVO nfeCabecalho) throws Exception {
        NfeDestinatarioVO destinatario = nfeCabecalho.getDestinatario();
        List<NfeDetalheVO> listaNfeDetalhe = nfeCabecalho.getListaNfeDetalhe();
        List<NfeFormaPagamentoVO> listaNfeFormaPagamento = nfeCabecalho.getListaNfeFormaPagamento();

        DecimalFormatSymbols simboloDecimal = DecimalFormatSymbols.getInstance();
        simboloDecimal.setDecimalSeparator('.');
        DecimalFormat formatoQuantidade = new DecimalFormat("0.0000", simboloDecimal);
        DecimalFormat formatoValor = new DecimalFormat("0.00", simboloDecimal);

        ObjectFactory factory = new ObjectFactory();

        CFe cfe = factory.createEnvCFeLoteCFeCFe();

        CFe.InfCFe infCFe = factory.createEnvCFeLoteCFeCFeInfCFe();
        cfe.setInfCFe(infCFe);

        infCFe.setVersaoDadosEnt("0.06");

        CFe.InfCFe.Ide ide = factory.createEnvCFeLoteCFeCFeInfCFeIde();
        infCFe.setIde(ide);

        //EXERCICIO: Criar tabela no banco de dados para armazenar configuração do SAT
        String cnpjSoftwareHouse = "11111111111111";

        ide.setCNPJ(cnpjSoftwareHouse);
        ide.setSignAC(SessaoUsuario.assinaturaSAT);
        ide.setNumeroCaixa("001");

        //emitente
        CFe.InfCFe.Emit emit = factory.createEnvCFeLoteCFeCFeInfCFeEmit();
        emit.setCNPJ("11111111111111");
        emit.setIE("111111111111");
        emit.setIM("123123");
        emit.setIndRatISSQN("S");
        infCFe.setEmit(emit);

        CFe.InfCFe.Dest dest = factory.createEnvCFeLoteCFeCFeInfCFeDest();
        infCFe.setDest(dest);

        //destinatário
        if (destinatario != null && destinatario.getCpfCnpj() != null) {
            if (destinatario.getCpfCnpj().length() == 14) {
                dest.setCNPJ(destinatario.getCpfCnpj());
            } else {
                dest.setCPF(destinatario.getCpfCnpj());
            }
            dest.setXNome(destinatario.getNome());
        }

        //detalhes
        List<CFe.InfCFe.Det> listaDet = infCFe.getDet();
        CFe.InfCFe.Det det;
        BigDecimal totalProdutos = BigDecimal.ZERO;
        BigDecimal totalImpostoAproximado = BigDecimal.ZERO;
        for (NfeDetalheVO nfeDetalhe : listaNfeDetalhe) {
            det = factory.createEnvCFeLoteCFeCFeInfCFeDet();
            CFe.InfCFe.Det.Prod prod = factory.createEnvCFeLoteCFeCFeInfCFeDetProd();

            det.setNItem(nfeDetalhe.getNumeroItem().toString());
            det.setProd(prod);

            det.getProd().setCProd(nfeDetalhe.getGtin());
            det.getProd().setCEAN(nfeDetalhe.getGtin());
            det.getProd().setXProd(nfeDetalhe.getNomeProduto());
            det.getProd().setNCM(nfeDetalhe.getNcm());
            det.getProd().setCFOP(nfeDetalhe.getCfop().toString());
            det.getProd().setUCom(nfeDetalhe.getUnidadeComercial());
            det.getProd().setQCom(formatoQuantidade.format(nfeDetalhe.getQuantidadeComercial()));
            det.getProd().setVUnCom(formatoValor.format(nfeDetalhe.getValorUnitarioComercial()));
            det.getProd().setVProd(formatoValor.format(nfeDetalhe.getValorTotal()));
            det.getProd().setIndRegra("A");
            det.getProd().setVDesc(nfeDetalhe.getValorDesconto().compareTo(BigDecimal.ZERO) == 0 ? null : formatoValor.format(nfeDetalhe.getValorDesconto()));
            det.getProd().setVOutro(nfeDetalhe.getValorOutrasDespesas().compareTo(BigDecimal.ZERO) == 0 ? null : formatoValor.format(nfeDetalhe.getValorOutrasDespesas()));
            det.setInfAdProd(nfeDetalhe.getInformacoesAdicionais());

            //Detalhes -- Impostos
            // imposto aproximado
            CFe.InfCFe.Det.Imposto imposto = factory.createEnvCFeLoteCFeCFeInfCFeDetImposto();
            det.setImposto(imposto);
            imposto.setVItem12741(formatoValor.format(nfeDetalhe.getNfeDetalheImpostoIcms().getValorIcms()));

            CFe.InfCFe.Det.Imposto.ICMS icms = factory.createEnvCFeLoteCFeCFeInfCFeDetImpostoICMS();
            det.getImposto().setICMS(icms);

            CFe.InfCFe.Det.Imposto.ICMS.ICMS00 icms00 = factory.createEnvCFeLoteCFeCFeInfCFeDetImpostoICMSICMS00();
            icms.setICMS00(icms00);

            icms00.setOrig(String.valueOf(nfeDetalhe.getNfeDetalheImpostoIcms().getOrigemMercadoria()));
            icms00.setCST(nfeDetalhe.getNfeDetalheImpostoIcms().getCstIcms());
            icms00.setPICMS(formatoValor.format(nfeDetalhe.getNfeDetalheImpostoIcms().getAliquotaIcms()));
            icms00.setVICMS(formatoValor.format(nfeDetalhe.getNfeDetalheImpostoIcms().getValorIcms()));

            CFe.InfCFe.Det.Imposto.PIS pis = factory.createEnvCFeLoteCFeCFeInfCFeDetImpostoPIS();
            imposto.setPIS(pis);
            CFe.InfCFe.Det.Imposto.PIS.PISSN pissn = factory.createEnvCFeLoteCFeCFeInfCFeDetImpostoPISPISSN();
            pis.setPISSN(pissn);
            pissn.setCST("49");

            CFe.InfCFe.Det.Imposto.COFINS cofins = factory.createEnvCFeLoteCFeCFeInfCFeDetImpostoCOFINS();
            imposto.setCOFINS(cofins);
            CFe.InfCFe.Det.Imposto.COFINS.COFINSSN cofinssn = factory.createEnvCFeLoteCFeCFeInfCFeDetImpostoCOFINSCOFINSSN();
            cofins.setCOFINSSN(cofinssn);
            cofinssn.setCST("49");

            totalProdutos = totalProdutos.add(nfeDetalhe.getValorTotal());
            totalImpostoAproximado = totalImpostoAproximado.add(nfeDetalhe.getNfeDetalheImpostoIcms().getValorIcms());

            listaDet.add(det);
        }

        CFe.InfCFe.Total total = factory.createEnvCFeLoteCFeCFeInfCFeTotal();
        infCFe.setTotal(total);

        CFe.InfCFe.Total.DescAcrEntr descAcrEntr = factory.createEnvCFeLoteCFeCFeInfCFeTotalDescAcrEntr();
        total.setDescAcrEntr(descAcrEntr);

        descAcrEntr.setVDescSubtot(formatoValor.format(nfeCabecalho.getValorDesconto()));

        total.setVCFeLei12741(formatoValor.format(totalImpostoAproximado));

        //formas de pagamento
        CFe.InfCFe.Pgto pgto = factory.createEnvCFeLoteCFeCFeInfCFePgto();
        infCFe.setPgto(pgto);
        for (NfeFormaPagamentoVO p : listaNfeFormaPagamento) {
            CFe.InfCFe.Pgto.MP mp = factory.createEnvCFeLoteCFeCFeInfCFePgtoMP();
            mp.setCMP(p.getNfceTipoPagamento().getCodigo());
            mp.setVMP(formatoValor.format(p.getValor()));

            pgto.getMP().add(mp);
        }

        CFe.InfCFe.InfAdic infAdic = factory.createEnvCFeLoteCFeCFeInfCFeInfAdic();
        infCFe.setInfAdic(infAdic);
        infAdic.setInfCpl("SAT - T2Ti.com");

        JAXBContext jc = JAXBContext.newInstance("br.gov.sp.fazenda.sat.cferecepcao");
        Marshaller marshaller = jc.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
        QName qName = new QName("CFe");
        JAXBElement<CFe> element = new JAXBElement<CFe>(qName, CFe.class, null, cfe);

        StringWriter writer = new StringWriter();
        marshaller.marshal(element, writer);

        return writer.toString();
    }

}
