package info.kuchciak.EntityDataBase;

import javafx.scene.chart.PieChart;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by michal on 30.12.2016.
 */

@Entity
public class Member {

    @Id
    @GeneratedValue
    private long id_member;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private java.sql.Date date;

    @OneToMany
    private List<Loan> loan;

    public List<Loan> getLoan() {return loan;}

    public void setLoan(List<Loan> loan) {this.loan = loan;}

    public java.sql.Date getDate() {return date;}

    public void setDate(java.sql.Date date) {this.date = date;}

    public long getId_member() {
        return id_member;
    }

    public void setId_member(long id_member) {
        this.id_member = id_member;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id_member=" + id_member +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                ", loan=" + loan +
                '}';
    }
}
