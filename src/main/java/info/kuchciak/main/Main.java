package info.kuchciak.main;

import info.kuchciak.OperationDataBase.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;


/**
 * Created by michal on 30.12.2016.
 */
public class Main {
    static EntityManagerFactory entityManagerFactory;
    static EntityManager entityManager;
    static ShowDataBase s;



    public static void main(String[] args){
        entityManagerFactory = Persistence.createEntityManagerFactory("db");
        entityManager = entityManagerFactory.createEntityManager();

        AddBook book = new AddBook();
        AddMember member = new AddMember();

        s = new ShowDataBase();
        //s.showMember();
        //s.showBook();
        menu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        choiceMenu(choice);


        entityManager.close();
        entityManagerFactory.close();
    }

    public static EntityManager getManager(){
        return entityManager;
    }

    private static void menu(){
        System.out.println("===========================");
        System.out.println("=========  MENU  ==========");
        System.out.println("===========================");
        System.out.println("1. Tabela użytkowników");
        System.out.println("2. Tabela książek");
        System.out.println("3. Dodaj użytkownika");
        System.out.println("4. Dodaj książkę");
        System.out.println("5. Usuń użytkownika");
        System.out.println("6. Usuń książkę");
        System.out.println("7. Rezerwuj");
        System.out.println("8. Modyfikuj użytkownika");
        System.out.println("9. Modyfikuj książkę");
        System.out.println("10. Zakończ");
        System.out.println("===========================");
        System.out.println("=========  v.1.0  =========");
        System.out.println("===========================");
    }

    private static void choiceMenu(int choice){
        switch (choice){
            case 1:
                s.showMember();
                break;
            case 2:
                s.showBook();
                break;
            case 3:
                NewMember newMember = new NewMember();
                newMember.addNewMember();
                break;
            case 4:
                NewBook newBook = new NewBook();
                newBook.addNewBook();
                break;
            case 5:
                DeleteMember deleteMember = new DeleteMember();
                deleteMember.deleteMemberWithDataBase();
                break;
            case 6:
                DeleteMember deleteBook = new DeleteMember();
                deleteBook.deleteMemberWithDataBase();
                break;
            case 7:
                AddLoan addLoan = new AddLoan();
                addLoan.addNewLoan();
                break;
            case 8:
                SetMember setMember = new SetMember();
                setMember.setMemberRow();
                break;
            case 9:
                SetBook setBook = new SetBook();
                setBook.setBookRow();
                break;
            case 10:
                System.exit(1);
                break;



        }



    }

}
