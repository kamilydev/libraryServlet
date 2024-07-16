package br.com.api.libraryservlet.dao;

import br.com.api.libraryservlet.models.Book;

import javax.persistence.EntityManager;
import java.util.List;

public class BookDao {
    private EntityManager em;

    public BookDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Book book){
        em.getTransaction().begin();
        this.em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(Book book){
        em.getTransaction().begin();
        this.em.merge(book);
        em.getTransaction().commit();
        em.close();
    }

    public void remover(Book book){
        em.getTransaction().begin();
        book = em.merge(book);
        this.em.remove(book);
        em.getTransaction().commit();
        em.close();
    }

    public List<Book> listarLivros() {
        em.getTransaction().begin();
        String jpql = "SELECT l FROM Book l";
        em.getTransaction().commit();
        em.close();
        return em.createQuery(jpql, Book.class).getResultList();

    }
}
