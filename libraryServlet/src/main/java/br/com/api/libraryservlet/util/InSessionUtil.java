package br.com.api.libraryservlet.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.function.Consumer;

//public static void inSession(EntityManagerFactory factory, Consumer<EntityManager> work) {
//    var entityManager = factory.createEntityManager();
//    var transaction = entityManager.getTransaction();
//    try {
//        transaction.begin();
//        work.accept(entityManager);
//        transaction.commit();
//    } catch (Exception e) {
//        if (transaction.isActive()) transaction.rollback();
//        throw e;
//    } finally {
//        entityManager.close();
//    }
//}
