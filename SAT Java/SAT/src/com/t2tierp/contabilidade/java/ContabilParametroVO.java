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
package com.t2tierp.contabilidade.java;

import com.t2tierp.cadastros.java.EmpresaVO;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.openswing.swing.message.receive.java.ValueObjectImpl;


@Entity
@Table(name = "CONTABIL_PARAMETRO")
public class ContabilParametroVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MASCARA")
    private String mascara;
    @Column(name = "NIVEIS")
    private Integer niveis;
    @Column(name = "INFORMAR_CONTA_POR")
    private String informarContaPor;
    @Column(name = "COMPARTILHA_PLANO_CONTA")
    private String compartilhaPlanoConta;
    @Column(name = "COMPARTILHA_HISTORICOS")
    private String compartilhaHistoricos;
    @Column(name = "ALTERA_LANCAMENTO_OUTRO")
    private String alteraLancamentoOutro;
    @Column(name = "HISTORICO_OBRIGATORIO")
    private String historicoObrigatorio;
    @Column(name = "PERMITE_LANCAMENTO_ZERADO")
    private String permiteLancamentoZerado;
    @Column(name = "GERA_INFORMATIVO_SPED")
    private String geraInformativoSped;
    @Column(name = "SPED_FORMA_ESCRIT_DIARIO")
    private String spedFormaEscritDiario;
    @Column(name = "SPED_NOME_LIVRO_DIARIO")
    private String spedNomeLivroDiario;
    @Column(name = "ASSINATURA_DIREITA")
    private String assinaturaDireita;
    @Column(name = "ASSINATURA_ESQUERDA")
    private String assinaturaEsquerda;
    @Column(name = "CONTA_ATIVO")
    private String contaAtivo;
    @Column(name = "CONTA_PASSIVO")
    private String contaPassivo;
    @Column(name = "CONTA_PATRIMONIO_LIQUIDO")
    private String contaPatrimonioLiquido;
    @Column(name = "CONTA_DEPRECIACAO_ACUMULADA")
    private String contaDepreciacaoAcumulada;
    @Column(name = "CONTA_CAPITAL_SOCIAL")
    private String contaCapitalSocial;
    @Column(name = "CONTA_RESULTADO_EXERCICIO")
    private String contaResultadoExercicio;
    @Column(name = "CONTA_PREJUIZO_ACUMULADO")
    private String contaPrejuizoAcumulado;
    @Column(name = "CONTA_LUCRO_ACUMULADO")
    private String contaLucroAcumulado;
    @Column(name = "CONTA_TITULO_PAGAR")
    private String contaTituloPagar;
    @Column(name = "CONTA_TITULO_RECEBER")
    private String contaTituloReceber;
    @Column(name = "CONTA_JUROS_PASSIVO")
    private String contaJurosPassivo;
    @Column(name = "CONTA_JUROS_ATIVO")
    private String contaJurosAtivo;
    @Column(name = "CONTA_DESCONTO_OBTIDO")
    private String contaDescontoObtido;
    @Column(name = "CONTA_DESCONTO_CONCEDIDO")
    private String contaDescontoConcedido;
    @Column(name = "CONTA_CMV")
    private String contaCmv;
    @Column(name = "CONTA_VENDA")
    private String contaVenda;
    @Column(name = "CONTA_VENDA_SERVICO")
    private String contaVendaServico;
    @Column(name = "CONTA_ESTOQUE")
    private String contaEstoque;
    @Column(name = "CONTA_APURA_RESULTADO")
    private String contaApuraResultado;
    @Column(name = "CONTA_JUROS_APROPRIAR")
    private String contaJurosApropriar;
    @Column(name = "ID_HIST_PADRAO_RESULTADO")
    private Integer idHistPadraoResultado;
    @Column(name = "ID_HIST_PADRAO_LUCRO")
    private Integer idHistPadraoLucro;
    @Column(name = "ID_HIST_PADRAO_PREJUIZO")
    private Integer idHistPadraoPrejuizo;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO empresa;

    public ContabilParametroVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Integer getNiveis() {
        return niveis;
    }

    public void setNiveis(Integer niveis) {
        this.niveis = niveis;
    }

    public String getInformarContaPor() {
        return informarContaPor;
    }

    public void setInformarContaPor(String informarContaPor) {
        this.informarContaPor = informarContaPor;
    }

    public String getCompartilhaPlanoConta() {
        return compartilhaPlanoConta;
    }

    public void setCompartilhaPlanoConta(String compartilhaPlanoConta) {
        this.compartilhaPlanoConta = compartilhaPlanoConta;
    }

    public String getCompartilhaHistoricos() {
        return compartilhaHistoricos;
    }

    public void setCompartilhaHistoricos(String compartilhaHistoricos) {
        this.compartilhaHistoricos = compartilhaHistoricos;
    }

    public String getAlteraLancamentoOutro() {
        return alteraLancamentoOutro;
    }

    public void setAlteraLancamentoOutro(String alteraLancamentoOutro) {
        this.alteraLancamentoOutro = alteraLancamentoOutro;
    }

    public String getHistoricoObrigatorio() {
        return historicoObrigatorio;
    }

    public void setHistoricoObrigatorio(String historicoObrigatorio) {
        this.historicoObrigatorio = historicoObrigatorio;
    }

    public String getPermiteLancamentoZerado() {
        return permiteLancamentoZerado;
    }

    public void setPermiteLancamentoZerado(String permiteLancamentoZerado) {
        this.permiteLancamentoZerado = permiteLancamentoZerado;
    }

    public String getGeraInformativoSped() {
        return geraInformativoSped;
    }

    public void setGeraInformativoSped(String geraInformativoSped) {
        this.geraInformativoSped = geraInformativoSped;
    }

    public String getSpedFormaEscritDiario() {
        return spedFormaEscritDiario;
    }

    public void setSpedFormaEscritDiario(String spedFormaEscritDiario) {
        this.spedFormaEscritDiario = spedFormaEscritDiario;
    }

    public String getSpedNomeLivroDiario() {
        return spedNomeLivroDiario;
    }

    public void setSpedNomeLivroDiario(String spedNomeLivroDiario) {
        this.spedNomeLivroDiario = spedNomeLivroDiario;
    }

    public String getAssinaturaDireita() {
        return assinaturaDireita;
    }

    public void setAssinaturaDireita(String assinaturaDireita) {
        this.assinaturaDireita = assinaturaDireita;
    }

    public String getAssinaturaEsquerda() {
        return assinaturaEsquerda;
    }

    public void setAssinaturaEsquerda(String assinaturaEsquerda) {
        this.assinaturaEsquerda = assinaturaEsquerda;
    }

    public String getContaAtivo() {
        return contaAtivo;
    }

    public void setContaAtivo(String contaAtivo) {
        this.contaAtivo = contaAtivo;
    }

    public String getContaPassivo() {
        return contaPassivo;
    }

    public void setContaPassivo(String contaPassivo) {
        this.contaPassivo = contaPassivo;
    }

    public String getContaPatrimonioLiquido() {
        return contaPatrimonioLiquido;
    }

    public void setContaPatrimonioLiquido(String contaPatrimonioLiquido) {
        this.contaPatrimonioLiquido = contaPatrimonioLiquido;
    }

    public String getContaDepreciacaoAcumulada() {
        return contaDepreciacaoAcumulada;
    }

    public void setContaDepreciacaoAcumulada(String contaDepreciacaoAcumulada) {
        this.contaDepreciacaoAcumulada = contaDepreciacaoAcumulada;
    }

    public String getContaCapitalSocial() {
        return contaCapitalSocial;
    }

    public void setContaCapitalSocial(String contaCapitalSocial) {
        this.contaCapitalSocial = contaCapitalSocial;
    }

    public String getContaResultadoExercicio() {
        return contaResultadoExercicio;
    }

    public void setContaResultadoExercicio(String contaResultadoExercicio) {
        this.contaResultadoExercicio = contaResultadoExercicio;
    }

    public String getContaPrejuizoAcumulado() {
        return contaPrejuizoAcumulado;
    }

    public void setContaPrejuizoAcumulado(String contaPrejuizoAcumulado) {
        this.contaPrejuizoAcumulado = contaPrejuizoAcumulado;
    }

    public String getContaLucroAcumulado() {
        return contaLucroAcumulado;
    }

    public void setContaLucroAcumulado(String contaLucroAcumulado) {
        this.contaLucroAcumulado = contaLucroAcumulado;
    }

    public String getContaTituloPagar() {
        return contaTituloPagar;
    }

    public void setContaTituloPagar(String contaTituloPagar) {
        this.contaTituloPagar = contaTituloPagar;
    }

    public String getContaTituloReceber() {
        return contaTituloReceber;
    }

    public void setContaTituloReceber(String contaTituloReceber) {
        this.contaTituloReceber = contaTituloReceber;
    }

    public String getContaJurosPassivo() {
        return contaJurosPassivo;
    }

    public void setContaJurosPassivo(String contaJurosPassivo) {
        this.contaJurosPassivo = contaJurosPassivo;
    }

    public String getContaJurosAtivo() {
        return contaJurosAtivo;
    }

    public void setContaJurosAtivo(String contaJurosAtivo) {
        this.contaJurosAtivo = contaJurosAtivo;
    }

    public String getContaDescontoObtido() {
        return contaDescontoObtido;
    }

    public void setContaDescontoObtido(String contaDescontoObtido) {
        this.contaDescontoObtido = contaDescontoObtido;
    }

    public String getContaDescontoConcedido() {
        return contaDescontoConcedido;
    }

    public void setContaDescontoConcedido(String contaDescontoConcedido) {
        this.contaDescontoConcedido = contaDescontoConcedido;
    }

    public String getContaCmv() {
        return contaCmv;
    }

    public void setContaCmv(String contaCmv) {
        this.contaCmv = contaCmv;
    }

    public String getContaVenda() {
        return contaVenda;
    }

    public void setContaVenda(String contaVenda) {
        this.contaVenda = contaVenda;
    }

    public String getContaVendaServico() {
        return contaVendaServico;
    }

    public void setContaVendaServico(String contaVendaServico) {
        this.contaVendaServico = contaVendaServico;
    }

    public String getContaEstoque() {
        return contaEstoque;
    }

    public void setContaEstoque(String contaEstoque) {
        this.contaEstoque = contaEstoque;
    }

    public String getContaApuraResultado() {
        return contaApuraResultado;
    }

    public void setContaApuraResultado(String contaApuraResultado) {
        this.contaApuraResultado = contaApuraResultado;
    }

    public String getContaJurosApropriar() {
        return contaJurosApropriar;
    }

    public void setContaJurosApropriar(String contaJurosApropriar) {
        this.contaJurosApropriar = contaJurosApropriar;
    }

    public Integer getIdHistPadraoResultado() {
        return idHistPadraoResultado;
    }

    public void setIdHistPadraoResultado(Integer idHistPadraoResultado) {
        this.idHistPadraoResultado = idHistPadraoResultado;
    }

    public Integer getIdHistPadraoLucro() {
        return idHistPadraoLucro;
    }

    public void setIdHistPadraoLucro(Integer idHistPadraoLucro) {
        this.idHistPadraoLucro = idHistPadraoLucro;
    }

    public Integer getIdHistPadraoPrejuizo() {
        return idHistPadraoPrejuizo;
    }

    public void setIdHistPadraoPrejuizo(Integer idHistPadraoPrejuizo) {
        this.idHistPadraoPrejuizo = idHistPadraoPrejuizo;
    }

    public EmpresaVO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaVO empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "com.t2tierp.contabilidade.java.ContabilParametroVO[id=" + id + "]";
    }

}
