package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Book;
import info.kuchciak.EntityDataBase.Loan;
import info.kuchciak.EntityDataBase.Member;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by michal on 31.12.2016.
 */
public class AddLoan {

    public void addNewLoan(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ID użytkownika rezerwującego :");
        long id_member = scanner.nextLong();
        System.out.println("Podaj ID książki rezerwowanej :");
        long id_book = scanner.nextLong();

        EntityManager entityManager = Main.getManager();

        TypedQuery<Member> queryMember = entityManager.createQuery("SELECT e FROM " + Member.class.getName() + " e WHERE id_member=" + id_member, Member.class);
        Member member = queryMember.getSingleResult();

        TypedQuery<Book> queryBook = entityManager.createQuery("SELECT e FROM " + Book.class.getName() + " e WHERE id_book=" + id_book, Book.class);
        Book book = queryBook.getSingleResult();

        Loan loan = new Loan();
        loan.setMember(member);
        loan.setBook(book);
        loan.setOut_date(new Date(Calendar.getInstance().getTimeInMillis()));
        loan.setDue_date(new Date((Calendar.getInstance().getTimeInMillis())*2));

        entityManager.getTransaction().begin();
        entityManager.persist(loan);
        entityManager.getTransaction().commit();

        System.out.println("Urzytkownik " + member.getFirstName() + " " + member.getLastName() + " zarezerwował kosiążke " + book.getTitle() + " autora " + book.getAuthor());

    }

}
