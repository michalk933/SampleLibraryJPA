package info.kuchciak.main;

import info.kuchciak.EntityDataBase.Member;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.Calendar;

/**
 * Created by michal on 30.12.2016.
 */
public class AddMember {

    public AddMember(){
        memberList();
    }

    public void memberList(){
        memberGenerator("Michał", "Kuchciak", "Zaułek", "Balin", "Polska", "32-500", "793014938");
        memberGenerator("Tomek", "Atomek", "Prosta", "Luszowice", "Polska", "32-500", "793014938");
        memberGenerator("Sławek", "Dudek", "Krzywa", "Zakopane", "Polska", "32-500", "793014938");
        memberGenerator("Anna", "Wróblewska", "Ślepa", "Nowy Sącz", "Polska", "32-500", "793014938");
        memberGenerator("Katarzyna", "Soboń", "Powstania", "Szczawnica", "Polska", "32-500", "793014938");
        memberGenerator("Jerzy", "Kołodziej", "Wyzwolenia", "Kalisz", "Polska", "32-500", "793014938");
        memberGenerator("Janusz", "Liszka", "Kleksa", "Sopot", "Polska", "32-500", "793014938");
        memberGenerator("Kaludia", "Szostek", "Internetu", "Gdynia", "Polska", "32-500", "793014938");
        memberGenerator("Mirek", "Głogowski", "Gucia", "Gdańsk", "Polska", "32-500", "793014938");
        memberGenerator("Sława", "Nowak", "Ogra", "Balin", "Wrocław", "32-500", "793014938");
        memberGenerator("Weronika", "Strączek", "Wodociągowa", "Opole", "Polska", "32-500", "793014938");
        memberGenerator("Natalia", "Knerowicz", "Krakowska", "Warszawa", "Polska", "32-500", "793014938");
        memberGenerator("Marta", "Hoffman", "kiełbasiana", "Olkusz", "Polska", "32-500", "793014938");
        memberGenerator("Paulia", "Porębska", "Wola", "Pszczyna", "Polska", "32-500", "793014938");
        memberGenerator("Przemek", "Kowalski", "Nauki", "Katowice", "Polska", "32-500", "793014938");
        memberGenerator("Michał", "Majka", "Wiedzy", "Kraków", "Polska", "32-500", "793014938");
        memberGenerator("Janusz", "Cebula", "Pracy", "Jaworzno", "Polska", "32-500", "793014938");
        memberGenerator("CJ", "Bob", "Grochowa", "Chrznów", "Polska", "32-500", "793014938");

    }

    public void memberGenerator(String firstName, String lastName, String street,
                                String city, String state, String zipCode, String phone){
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
