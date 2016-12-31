package info.kuchciak.OperationDataBase;

import info.kuchciak.EntityDataBase.Member;
import info.kuchciak.main.Main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Scanner;

/**
 * Created by michal on 31.12.2016.
 */
public class SetMember {

    public void setMemberRow(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ID użytkownika :");
        long id_member = scanner.nextLong();

        System.out.println("Podaj Wartość do zmiany : \n1. Imie\n2. Nazwisko\n3. Miasto\n4. Ulica\n5. Kraj\n6. Kod pocztowy\n7. Numer telefonu");
        int change = scanner.nextInt();


        EntityManager entityManager = Main.getManager();

        entityManager.getTransaction().begin();
        Member member = entityManager.find(Member.class,id_member);
        chqngeQuery(member,change);
        entityManager.getTransaction().commit();

        entityManager.refresh(member);
        System.out.println(member.toString());

    }

    private void chqngeQuery(Member member, int change){
        Scanner scanner = new Scanner(System.in);
        String newValue ="";
        switch (change){
            case 1:
                System.out.println("Podaj nowe imie :");
                newValue = scanner.next();
                member.setFirstName(newValue);
                break;
            case 2:
                System.out.println("Podaj nowe nazwisko :");
                newValue = scanner.next();
                member.setLastName(newValue);
                break;
            case 3:
                System.out.println("Podaj nowe miasto :");
                newValue = scanner.next();
                member.setCity(newValue);
                break;
            case 4:
                System.out.println("Podaj nowe Ulicę :");
                newValue = scanner.next();
                member.setStreet(newValue);
                break;
            case 5:
                System.out.println("Podaj nowe kraj :");
                newValue = scanner.next();
                member.setState(newValue);
                break;
            case 6:
                System.out.println("Podaj nowe kod pocztowy :");
                newValue = scanner.next();
                member.setZipCode(newValue);
                break;
            case 7:
                System.out.println("Podaj nowe numer telefonu :");
                newValue = scanner.next();
                member.setPhone(newValue);
                break;
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }

    }




}
