package br.com.api.libraryservlet.dao;

import br.com.api.libraryservlet.models.Logger;

import javax.persistence.EntityManager;

public class LoggerDao {

    private EntityManager em;

    public LoggerDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Logger logger){
        this.em.persist(logger);
    }

//    public void atualizar(Logger logger){
//        this.em.merge(logger);
//    }
//
//    public void remover(Logger logger){
//        logger = em.merge(logger);
//        this.em.remove(logger);
//    }
}
