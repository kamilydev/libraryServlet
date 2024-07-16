package br.com.api.libraryservlet.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY = Persistence
            .createEntityManagerFactory("libraryServlet");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }

}