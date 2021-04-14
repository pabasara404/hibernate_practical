package lk.earth.hibernate_practical;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Suppliertype {

    @Id
    private Integer id;
    private String name;

    @JsonIgnore//ignore the below relationship
    @OneToMany(mappedBy = "suppliertype")//oyata onetomany relationship ekak thynwa suppliertype kyla
    private List<Supplier> supplierList;//many ena nisa

    public Integer getId(){return id;}
    public void setId(Integer id){this.id=id;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public List<Supplier> getSupplierList(){return supplierList;}
    public void setSupplierList(List<Supplier> supplierList){this.supplierList=supplierList;}

    //constructor
    public Suppliertype(Integer id){
        this.id=id;
    }

    public Suppliertype(){}

//    public Suppliertype(Integer id, String name){
//        this.id=id;
//        this.name=name;
//    }


}


