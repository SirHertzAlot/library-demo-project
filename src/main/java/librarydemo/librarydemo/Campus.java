package librarydemo.librarydemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campus {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String location;

    protected Campus(){}

    public Campus(String location){
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
}
