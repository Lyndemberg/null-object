package com.ifpb.padroes.nullobject.app;

import com.ifpb.padroes.nullobject.dao.HistoricoDao;
import com.ifpb.padroes.nullobject.model.Historico;

/**
 *
 * @author lyndemberg
 */
public class App {
    public static void main(String[] args) {
        HistoricoDao dao = new HistoricoDao();
        
        Historico h1 = dao.getHistoricoEmprestimos("201801");
        System.out.println(h1.getMatricula() + " ---> " + h1.getEmprestados());
        
        Historico h2 = dao.getHistoricoEmprestimos("201701");
        System.out.println(h2.getMatricula() + " ---> " + h2.getEmprestados());
    }
}
