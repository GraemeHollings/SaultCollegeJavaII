package Lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author 17009434
 */

@Entity
public class Magazine extends Publication {

    @Basic
    private int currIssue;

    @Basic
    private int orderQty;

    public Magazine(String name, int sue, int quant) {
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCurrIssue() {
        return currIssue;
    }

    public void setCurrIssue(int currIssue) {
       
        this.currIssue = currIssue;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

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

    public void setcurrIssue(int new_issue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}