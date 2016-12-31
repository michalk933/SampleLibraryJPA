package info.kuchciak.EntityDataBase;

import javax.persistence.*;
import java.util.List;

/**
 * Created by michal on 30.12.2016.
 */

@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id_book;

    private long isbn;
    private String title;
    private String author;

    @OneToMany
    private List<Loan> loan;

    public List<Loan> getLoan() {return loan;}

    public void setLoan(List<Loan> loan) {this.loan = loan;}

    public long getId_book() {return id_book;}

    public void setId_book(long id_book) {this.id_book = id_book;}

    public long getIsbn() {return isbn;}

    public void setIsbn(long isbn) {this.isbn = isbn;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    @Override
    public String toString() {
        return "Book{" +
                "id_book=" + id_book +
                ", isbn=" + isbn +
                ", title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", loan=" + loan +
                '}';
    }
}
