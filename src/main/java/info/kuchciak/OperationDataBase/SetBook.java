package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Book;
import info.kuchciak.EntityDataBase.Member;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import java.util.Scanner;

/**
 * Created by michal on 31.12.2016.
 */
public class SetBook {

    public void setBookRow(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ID książki :");
        long id_book = scanner.nextLong();

        System.out.println("Podaj Wartość do zmiany : \n1. Isbn\n2. Tytuł\n3. Autor");
        int change = scanner.nextInt();

        EntityManager entityManager = Main.getManager();

        entityManager.getTransaction().begin();
        Book book = entityManager.find(Book.class, id_book);
        chqngeQuery(book,change);
        entityManager.getTransaction().commit();

        entityManager.refresh(book);
        System.out.println(book.toString());

    }

    private void chqngeQuery(Book book, int change){
        Scanner scanner = new Scanner(System.in);
        String newValue ="";
        int isbn =0;
        switch (change){
            case 1:
                System.out.println("Podaj nowy numer ISBN :");
                isbn = scanner.nextInt();
                book.setIsbn(isbn);
                break;
            case 2:
                System.out.println("Podaj nowy tytuł :");
                newValue = scanner.next();
                book.setTitle(newValue);
                break;
            case 3:
                System.out.println("Podaj nowego autora :");
                newValue = scanner.next();
                book.setAuthor(newValue);
                break;
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }

    }

}
