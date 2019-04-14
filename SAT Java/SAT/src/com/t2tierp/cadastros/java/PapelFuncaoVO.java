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
package com.t2tierp.cadastros.java;

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
@Table(name = "PAPEL_FUNCAO")
public class PapelFuncaoVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PODE_CONSULTAR")
    private String podeConsultar;
    @Column(name = "PODE_INSERIR")
    private String podeInserir;
    @Column(name = "PODE_ALTERAR")
    private String podeAlterar;
    @Column(name = "PODE_EXCLUIR")
    private String podeExcluir;
    @Column(name = "HABILITADO")
    private String habilitado;
    @JoinColumn(name = "ID_PAPEL", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PapelVO papel;
    @JoinColumn(name = "ID_FUNCAO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private FuncaoVO funcao;

    public PapelFuncaoVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPodeConsultar() {
        return podeConsultar;
    }

    public void setPodeConsultar(String podeConsultar) {
        this.podeConsultar = podeConsultar;
    }

    public String getPodeInserir() {
        return podeInserir;
    }

    public void setPodeInserir(String podeInserir) {
        this.podeInserir = podeInserir;
    }

    public String getPodeAlterar() {
        return podeAlterar;
    }

    public void setPodeAlterar(String podeAlterar) {
        this.podeAlterar = podeAlterar;
    }

    public String getPodeExcluir() {
        return podeExcluir;
    }

    public void setPodeExcluir(String podeExcluir) {
        this.podeExcluir = podeExcluir;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public PapelVO getPapel() {
        return papel;
    }

    public void setPapel(PapelVO papel) {
        this.papel = papel;
    }

    public FuncaoVO getFuncao() {
        return funcao;
    }

    public void setFuncao(FuncaoVO funcao) {
        this.funcao = funcao;
    }


    @Override
    public String toString() {
        return "com.t2tierp.cadastros.java.PapelFuncaoVO[id=" + id + "]";
    }

}
