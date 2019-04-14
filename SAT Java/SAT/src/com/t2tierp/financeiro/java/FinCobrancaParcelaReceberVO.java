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
package com.t2tierp.financeiro.java;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.openswing.swing.message.receive.java.ValueObjectImpl;


@Entity
@Table(name = "FIN_COBRANCA_PARCELA_RECEBER")
public class FinCobrancaParcelaReceberVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ID_FIN_LANCAMENTO_RECEBER")
    private Integer idFinLancamentoReceber;
    @Column(name = "ID_FIN_PARCELA_RECEBER")
    private Integer idFinParcelaReceber;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_VENCIMENTO")
    private Date dataVencimento;
    @Column(name = "VALOR_PARCELA")
    private BigDecimal valorParcela;
    @Column(name = "VALOR_JURO_SIMULADO")
    private BigDecimal valorJuroSimulado;
    @Column(name = "VALOR_MULTA_SIMULADO")
    private BigDecimal valorMultaSimulado;
    @Column(name = "VALOR_RECEBER_SIMULADO")
    private BigDecimal valorReceberSimulado;
    @Column(name = "VALOR_JURO_ACORDO")
    private BigDecimal valorJuroAcordo;
    @Column(name = "VALOR_MULTA_ACORDO")
    private BigDecimal valorMultaAcordo;
    @Column(name = "VALOR_RECEBER_ACORDO")
    private BigDecimal valorReceberAcordo;
    @JoinColumn(name = "ID_FIN_COBRANCA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private FinCobrancaVO finCobranca;

    public FinCobrancaParcelaReceberVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdFinLancamentoReceber() {
        return idFinLancamentoReceber;
    }

    public void setIdFinLancamentoReceber(Integer idFinLancamentoReceber) {
        this.idFinLancamentoReceber = idFinLancamentoReceber;
    }

    public Integer getIdFinParcelaReceber() {
        return idFinParcelaReceber;
    }

    public void setIdFinParcelaReceber(Integer idFinParcelaReceber) {
        this.idFinParcelaReceber = idFinParcelaReceber;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public BigDecimal getValorJuroSimulado() {
        return valorJuroSimulado;
    }

    public void setValorJuroSimulado(BigDecimal valorJuroSimulado) {
        this.valorJuroSimulado = valorJuroSimulado;
    }

    public BigDecimal getValorMultaSimulado() {
        return valorMultaSimulado;
    }

    public void setValorMultaSimulado(BigDecimal valorMultaSimulado) {
        this.valorMultaSimulado = valorMultaSimulado;
    }

    public BigDecimal getValorReceberSimulado() {
        return valorReceberSimulado;
    }

    public void setValorReceberSimulado(BigDecimal valorReceberSimulado) {
        this.valorReceberSimulado = valorReceberSimulado;
    }

    public BigDecimal getValorJuroAcordo() {
        return valorJuroAcordo;
    }

    public void setValorJuroAcordo(BigDecimal valorJuroAcordo) {
        this.valorJuroAcordo = valorJuroAcordo;
    }

    public BigDecimal getValorMultaAcordo() {
        return valorMultaAcordo;
    }

    public void setValorMultaAcordo(BigDecimal valorMultaAcordo) {
        this.valorMultaAcordo = valorMultaAcordo;
    }

    public BigDecimal getValorReceberAcordo() {
        return valorReceberAcordo;
    }

    public void setValorReceberAcordo(BigDecimal valorReceberAcordo) {
        this.valorReceberAcordo = valorReceberAcordo;
    }

    public FinCobrancaVO getFinCobranca() {
        return finCobranca;
    }

    public void setFinCobranca(FinCobrancaVO finCobranca) {
        this.finCobranca = finCobranca;
    }


    @Override
    public String toString() {
        return "com.t2tierp.financeiro.java.FinCobrancaParcelaReceberVO[id=" + id + "]";
    }

}
