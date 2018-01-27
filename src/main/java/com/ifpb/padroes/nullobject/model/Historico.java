/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.padroes.nullobject.model;

import java.util.List;

/**
 *
 * @author lyndemberg
 */
public abstract class Historico {
    private String matricula;
    private List<Livro> emprestados;

    public Historico(String matricula, List<Livro> emprestados) {
        this.matricula = matricula;
        this.emprestados = emprestados;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Livro> getEmprestados() {
        return emprestados;
    }

    public void setEmprestados(List<Livro> emprestados) {
        this.emprestados = emprestados;
    }
    
    
}
