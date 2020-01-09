package Lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author 17009434
 */

@Entity
public class Book extends Publication {

    @Basic
    private String Author;

    public Book(String name, String author, int quant, float price) {
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Book() {
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

//    public String getAuthor() {
      //  return Author;
   // }

  //  public void setAuthor(String Author) {
    //    this.Author = Author;
    //}

    @Override
    public void sellCopy() {
    }

    @Override
    public void getPrice() {
    }

    public void setName(String new_title) {
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

}