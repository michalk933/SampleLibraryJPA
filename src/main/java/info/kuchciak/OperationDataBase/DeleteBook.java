package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Book;
import info.kuchciak.EntityDataBase.Member;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Scanner;

/**
 * Created by michal on 30.12.2016.
 */
public class DeleteBook {

    public void DeleteBookWithDataBase(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ID książki :");
        long id = scanner.nextLong();

        EntityManager entityManager = Main.getManager();
        TypedQuery<Book> query = entityManager.createQuery("SELECT e FROM " + Book.class.getName() + " e WHERE e.id_book=" + id, Book.class);
        Book book = query.getSingleResult();

        entityManager.getTransaction().begin();
        entityManager.remove(book);
        entityManager.getTransaction().commit();

    }


}
