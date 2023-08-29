package librarydemo.librarydemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HashTag {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String hashTagName;

    protected HashTag(){}

    public HashTag(String hashTagName){
        this.hashTagName = hashTagName;
    }

    public long getId() {
        return id;
    }

    public String gethashTagName() {
        return hashTagName;
    }
}