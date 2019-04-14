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

import java.io.Serializable;
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
@Table(name = "CONTABIL_TERMO")
public class ContabilTermoVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ABERTURA_ENCERRAMENTO")
    private String aberturaEncerramento;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PAGINA_INICIAL")
    private Integer paginaInicial;
    @Column(name = "PAGINA_FINAL")
    private Integer paginaFinal;
    @Column(name = "REGISTRADO")
    private String registrado;
    @Column(name = "NUMERO_REGISTRO")
    private String numeroRegistro;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_DESPACHO")
    private Date dataDespacho;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ABERTURA")
    private Date dataAbertura;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENCERRAMENTO")
    private Date dataEncerramento;
    @Temporal(TemporalType.DATE)
    @Column(name = "ESCRITURACAO_INICIO")
    private Date escrituracaoInicio;
    @Temporal(TemporalType.DATE)
    @Column(name = "ESCRITURACAO_FIM")
    private Date escrituracaoFim;
    @Column(name = "TEXTO")
    private String texto;
    @JoinColumn(name = "ID_CONTABIL_LIVRO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ContabilLivroVO contabilLivro;

    public ContabilTermoVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAberturaEncerramento() {
        return aberturaEncerramento;
    }

    public void setAberturaEncerramento(String aberturaEncerramento) {
        this.aberturaEncerramento = aberturaEncerramento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(Integer paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public Integer getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(Integer paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    public String getRegistrado() {
        return registrado;
    }

    public void setRegistrado(String registrado) {
        this.registrado = registrado;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Date getDataDespacho() {
        return dataDespacho;
    }

    public void setDataDespacho(Date dataDespacho) {
        this.dataDespacho = dataDespacho;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public Date getEscrituracaoInicio() {
        return escrituracaoInicio;
    }

    public void setEscrituracaoInicio(Date escrituracaoInicio) {
        this.escrituracaoInicio = escrituracaoInicio;
    }

    public Date getEscrituracaoFim() {
        return escrituracaoFim;
    }

    public void setEscrituracaoFim(Date escrituracaoFim) {
        this.escrituracaoFim = escrituracaoFim;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ContabilLivroVO getContabilLivro() {
        return contabilLivro;
    }

    public void setContabilLivro(ContabilLivroVO contabilLivro) {
        this.contabilLivro = contabilLivro;
    }


    @Override
    public String toString() {
        return "com.t2tierp.contabilidade.java.ContabilTermoVO[id=" + id + "]";
    }

}
