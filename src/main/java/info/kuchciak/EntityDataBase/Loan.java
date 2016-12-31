package info.kuchciak.EntityDataBase;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by michal on 30.12.2016.
 */

@Entity
public class Loan {

    @Id
    @GeneratedValue
    private long id_loan;

    private Date out_date;
    private Date due_date;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Book book;

    public long getId_loan() {return id_loan;}

    public void setId_loan(long id_loan) {this.id_loan = id_loan;}

    public Date getOut_date() {return out_date;}

    public void setOut_date(Date out_date) {this.out_date = out_date;}

    public Date getDue_date() {return due_date;}

    public void setDue_date(Date due_date) {this.due_date = due_date;}

    public Member getMember() {return member;}

    public void setMember(Member member) {this.member = member;}

    public Book getBook() {return book;}

    public void setBook(Book book) {this.book = book;}

    @Override
    public String toString() {
        return "Loan{" +
                "id_loan=" + id_loan +
                ", out_date=" + out_date +
                ", due_date=" + due_date +
                ", member=" + member +
                ", book=" + book +
                '}';
    }
}
