package librarydemo.librarydemo;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;



    protected Author(){}

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @ManyToMany(mappedBy = "books")
    private Collection<Author> authors;
}