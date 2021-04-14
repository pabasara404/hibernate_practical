package lk.earth.hibernate_practical;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Subject {

    @Id
    private Integer id;
    private String name;
    private Integer credit;

    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Topic> topicList;

    public Subject(){};
    public Subject(Integer id){this.id=id;}

    public Integer getId(){return id;}
    public void setId(Integer id){this.id=id;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public Integer getCredit(){return credit;}
    public void setCredit(Integer credit){this.credit=credit;}

    public List<Topic> getTopicList(){return topicList;}
    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }
}
