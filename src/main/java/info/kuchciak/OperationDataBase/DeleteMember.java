package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Member;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Scanner;

/**
 * Created by michal on 30.12.2016.
 */
public class DeleteMember {

    public void deleteMemberWithDataBase(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ID użytkownika :");
        long id = scanner.nextLong();

        EntityManager entityManager = Main.getManager();
        TypedQuery<Member> query = entityManager.createQuery("SELECT e FROM " + Member.class.getName() + " e WHERE e.id_member=" + id, Member.class);
        Member member = query.getSingleResult();

        entityManager.getTransaction().begin();
        entityManager.remove(member);
        entityManager.getTransaction().commit();

    }


}
