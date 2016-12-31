package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Book;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import java.util.Scanner;

/**
 * Created by michal on 30.12.2016.
 */
public class NewBook {

    private long isbn;
    private String title;
    private String author;

    public void addNewBook(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tytuł :");
        title = scanner.next();
        System.out.println("Podaj autora :");
        author = scanner.next();
        System.out.println("Podaj numer ISBN :");
        isbn = scanner.nextInt();

        EntityManager entityManager = Main.getManager();
        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);

        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();

    }

}
