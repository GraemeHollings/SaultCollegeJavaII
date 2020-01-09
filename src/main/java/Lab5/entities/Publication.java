package Lab5.entities;

import Lab4.SaleableItem;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 17009434
 */

@Entity
public abstract class Publication implements SaleableItem, Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String Title;

    @Basic
    private int Copies;

    @Basic
    private float Price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getCopies() {
        return Copies;
    }

    public void setCopies(int Copies) {
        this.Copies = Copies;
    }

//    public float getPrice() {
       /// return Price;
   // }

  //  public void setPrice(float Price) {
      //  this.Price = Price;
   // }

   // public String getTitle() {
    //    return Title;
   // }

   // public void setTitle(String Title) {
     //   this.Title = Title;
   // }

    //public int getCopies() {
      //  return Copies;
  //  }

    //public void setCopies(int Copies) {
     //  this.Copies = Copies;
   // }

}