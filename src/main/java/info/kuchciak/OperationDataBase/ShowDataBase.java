package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Book;
import info.kuchciak.EntityDataBase.Member;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by michal on 30.12.2016.
 */
public class ShowDataBase {

    public void showMember(){
        EntityManager entityManager = Main.getManager();

        TypedQuery<Member> query = entityManager.createQuery("SELECT e FROM " + Member.class.getName() + " e", Member.class);
        List<Member> listMember = query.getResultList();

        for(Member m : listMember) {
            System.out.println(m.toString());
            System.out.println("=======================================");
        }

    }

    public void showBook(){
        EntityManager entityManager = Main.getManager();


        TypedQuery<Book> query = entityManager.createQuery("SELECT e FROM " + Book.class.getName() + " e", Book.class);
        List<Book> listBook = query.getResultList();

        for(Book b : listBook) {
            System.out.println(b.toString());
            System.out.println("=======================================");
        }

    }




}
