package lk.earth.hibernate_practical;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Topic {

    @Id
    private Integer id;
    private String name;
    private BigDecimal hours;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Subject subject;

    public Topic(){}
    public Topic(Integer id){this.id=id;}

    public Integer getId(){return id;}
    public void setId(Integer id){this.id=id;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public BigDecimal getHours(){return hours;}
    public void setHours(BigDecimal hours){this.hours=hours;}

    public Subject getSubject(){return subject;}
    public void setSubject(Subject subject){this.subject=subject;}

}
