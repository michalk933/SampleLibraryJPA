package info.kuchciak.main;

import info.kuchciak.EntityDataBase.Book;

import javax.persistence.EntityManager;


/**
 * Created by michal on 30.12.2016.
 */
public class AddBook {

    public AddBook(){
        bookList();
    }

    public void bookList(){
        bookGenerator(456789, "Harry Potter", "J.K.Rolnik");
        bookGenerator(156789, "Hobbit", "Tolkien");
        bookGenerator(256789, "Wiking", "T.Odyn");
        bookGenerator(356789, "Torgal", "F.Niepamietam");
        bookGenerator(556789, "X-man", "T.Komiks");
        bookGenerator(656789, "Legenda", "Z.Leg");
        bookGenerator(756789, "JAVA kompendium", "C.Kawa");
        bookGenerator(856789, "Alicja z krainy czarów", "J.R.Baśń");
        bookGenerator(956789, "PHP", "L.Hacker");
        bookGenerator(106789, "Matematyka", "V.Numan");
        bookGenerator(116789, "Medycyna Chińska", "P.Jajamiomate");
        bookGenerator(126789, "Grywalizajca", "R.Gamer");
        bookGenerator(136789, "Blank", "P.Pusto");
        bookGenerator(146789, "Świat między oceanami", "M.Woda");
        bookGenerator(156789, "Ukryte terapie", "K.Lekarz");
        bookGenerator(166789, "Król", "K.Quin");
        bookGenerator(176789, "MASA", "M.Mafia");
        bookGenerator(186789, "Małe życie", "W.Little");
        bookGenerator(196789, "Dziewczyna z pociągu", "P.Konduktor");
        bookGenerator(206789, "Metro 2033", "D.Głuchowski");
        bookGenerator(216789, "Pokolenie IKEA", "J.Piotr");
        bookGenerator(226789, "Przeznaczeni", "G.Katarzyna");

    }

    public void bookGenerator(long isbn, String title, String author){
        EntityManager entityManager = Main.getManager();
        Book book = new Book();

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setAuthor(author);

        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();

    }




}
