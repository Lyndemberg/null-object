package com.ifpb.padroes.nullobject.model;

import java.util.List;

/**
 *
 * @author lyndemberg
 */
public class HistoricoDefault extends Historico{

    public HistoricoDefault(String matricula, List<Livro> emprestados) {
        super(matricula, emprestados);
    }

    
}
