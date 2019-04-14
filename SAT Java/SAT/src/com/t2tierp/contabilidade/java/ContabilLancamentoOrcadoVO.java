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
import java.math.BigDecimal;
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
@Table(name = "CONTABIL_LANCAMENTO_ORCADO")
public class ContabilLancamentoOrcadoVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ANO")
    private String ano;
    @Column(name = "JANEIRO")
    private BigDecimal janeiro;
    @Column(name = "FEVEREIRO")
    private BigDecimal fevereiro;
    @Column(name = "MARCO")
    private BigDecimal marco;
    @Column(name = "ABRIL")
    private BigDecimal abril;
    @Column(name = "MAIO")
    private BigDecimal maio;
    @Column(name = "JUNHO")
    private BigDecimal junho;
    @Column(name = "JULHO")
    private BigDecimal julho;
    @Column(name = "AGOSTO")
    private BigDecimal agosto;
    @Column(name = "SETEMBRO")
    private BigDecimal setembro;
    @Column(name = "OUTUBRO")
    private BigDecimal outubro;
    @Column(name = "NOVEMBRO")
    private BigDecimal novembro;
    @Column(name = "DEZEMBRO")
    private BigDecimal dezembro;
    @JoinColumn(name = "ID_CONTABIL_CONTA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ContabilContaVO contabilConta;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO empresa;

    public ContabilLancamentoOrcadoVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public BigDecimal getJaneiro() {
        return janeiro;
    }

    public void setJaneiro(BigDecimal janeiro) {
        this.janeiro = janeiro;
    }

    public BigDecimal getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(BigDecimal fevereiro) {
        this.fevereiro = fevereiro;
    }

    public BigDecimal getMarco() {
        return marco;
    }

    public void setMarco(BigDecimal marco) {
        this.marco = marco;
    }

    public BigDecimal getAbril() {
        return abril;
    }

    public void setAbril(BigDecimal abril) {
        this.abril = abril;
    }

    public BigDecimal getMaio() {
        return maio;
    }

    public void setMaio(BigDecimal maio) {
        this.maio = maio;
    }

    public BigDecimal getJunho() {
        return junho;
    }

    public void setJunho(BigDecimal junho) {
        this.junho = junho;
    }

    public BigDecimal getJulho() {
        return julho;
    }

    public void setJulho(BigDecimal julho) {
        this.julho = julho;
    }

    public BigDecimal getAgosto() {
        return agosto;
    }

    public void setAgosto(BigDecimal agosto) {
        this.agosto = agosto;
    }

    public BigDecimal getSetembro() {
        return setembro;
    }

    public void setSetembro(BigDecimal setembro) {
        this.setembro = setembro;
    }

    public BigDecimal getOutubro() {
        return outubro;
    }

    public void setOutubro(BigDecimal outubro) {
        this.outubro = outubro;
    }

    public BigDecimal getNovembro() {
        return novembro;
    }

    public void setNovembro(BigDecimal novembro) {
        this.novembro = novembro;
    }

    public BigDecimal getDezembro() {
        return dezembro;
    }

    public void setDezembro(BigDecimal dezembro) {
        this.dezembro = dezembro;
    }

    public ContabilContaVO getContabilConta() {
        return contabilConta;
    }

    public void setContabilConta(ContabilContaVO contabilConta) {
        this.contabilConta = contabilConta;
    }

    public EmpresaVO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaVO empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "com.t2tierp.contabilidade.java.ContabilLancamentoOrcadoVO[id=" + id + "]";
    }

}
