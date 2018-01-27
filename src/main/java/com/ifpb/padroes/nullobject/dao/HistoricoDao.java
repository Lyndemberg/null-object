/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.padroes.nullobject.dao;

import com.ifpb.padroes.nullobject.model.Historico;
import com.ifpb.padroes.nullobject.model.HistoricoDefault;
import com.ifpb.padroes.nullobject.model.HistoricoNulo;
import com.ifpb.padroes.nullobject.model.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lyndemberg
 */
public class HistoricoDao {
    Livro l1 = new Livro("123", "Zezinho", "A lagoa azul");
    Livro l2 = new Livro("456", "Goodrich", "Segurança de computadores");
    Livro l3 = new Livro("789", "Debu Parnda", "EJB3 em ação");
    Livro l4 = new Livro("321", "Chin Gao", "Pro JavaFX");
    List<Livro> emprestados;
    public HistoricoDao(){
        emprestados = new ArrayList<>();
        emprestados.add(l1);
        emprestados.add(l2);
        emprestados.add(l3);
        emprestados.add(l4);
    }
    
    
    public Historico getHistoricoEmprestimos(String matricula){
        Historico retorno = null;
        if(matricula.equals("201801")){
            retorno = new HistoricoDefault(matricula,emprestados);
        }else{
            retorno = new HistoricoNulo();
        }
        return retorno;
    }
    
    
    
}
