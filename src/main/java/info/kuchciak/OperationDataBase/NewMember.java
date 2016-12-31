package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Member;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by michal on 30.12.2016.
 */
public class NewMember {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    String zipCode;
    String phone;


    public void addNewMember(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie :");
        firstName = scanner.next();
        System.out.println("Podaj nazwisko :");
        lastName = scanner.next();
        System.out.println("Podaj kraj :");
        state = scanner.next();
        System.out.println("Podaj miasto :");
        city = scanner.next();
        System.out.println("Podaj ulicę :");
        street = scanner.next();
        System.out.println("Podaj kod pocztowy :");
        zipCode = scanner.next();
        System.out.println("Podaj numer telefonu :");
        phone = scanner.next();

        EntityManager entityManager = Main.getManager();
        Member member = new Member();

        member.setFirstName(firstName);
        member.setLastName(lastName);
        member.setStreet(street);
        member.setCity(city);
        member.setState(state);
        member.setZipCode(zipCode);
        member.setPhone(phone);
        member.setDate(new Date(Calendar.getInstance().getTimeInMillis()));

        entityManager.getTransaction().begin();
        entityManager.persist(member);
        entityManager.getTransaction().commit();

    }
}
