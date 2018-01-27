/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.padroes.nullobject.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lyndemberg
 */
public class HistoricoNulo extends Historico{
    
    public HistoricoNulo() {
        super("", new ArrayList<Livro>());
    }
    
}
