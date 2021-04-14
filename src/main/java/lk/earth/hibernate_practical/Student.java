package lk.earth.hibernate_practical;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //this is a entity class
@SQLDelete(sql ="update student set deleted =true where id=?")
@Where(clause="deleted=false")
public class Student {
    @Id //id is the primary key
    private Integer id;
    private String name;
    private Integer age;
    private Boolean deleted;

    public Integer getId(){ return id;}
    public void setId(Integer id){ this.id=id; }

    public String getName(){ return name;}
    public void setName(String name){ this.name=name;}

    public Integer getAge(){ return age;}
    public void setAge(Integer age){this.age=age;}

    //adding getters and setters for delete
    public Boolean getDeleted(){ return deleted;}
    public void setDeleted(Boolean deleted){this.deleted=deleted;}
}
