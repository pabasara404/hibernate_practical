package lk.earth.hibernate_practical;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Supplier{

    @Id
    private Integer id;
    private String name;
    private String contact1;
    private String contact2;


    @ManyToOne
    private Suppliertype suppliertype;

    public Integer getId(){return id;}
    public void setId(Integer id){this.id=id;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getContact1(){return contact1;}
    public void setContact1(String contact1){this.contact1=contact1;}

    public String getContact2(){return contact2;}
    public void setContact2(String contact2){this.contact2=contact2;}

    //relationship
    public Suppliertype getSuppliertype(){return suppliertype;}
    public void setSuppliertype(Suppliertype suppliertype) {
        this.suppliertype = suppliertype;
    }

}
