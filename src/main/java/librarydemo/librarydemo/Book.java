package librarydemo.librarydemo;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String campus;
    private String author;

    protected Book(){}

    public Book(String title, String description, String campus, String author){
        this.title = title;
        this.description = description;
        this.campus = campus;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCampus() {
        return campus;
    }

    public String getAuthor() {
        return author;
    }

    @OneToMany(mappedBy = "author")
    private Collection<Book> books;
}
