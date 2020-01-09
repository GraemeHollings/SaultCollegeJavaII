package Lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author 17009434
 */

@Entity
public class Ticket extends Publication {

    @Basic
    private int TicketQty;

    public Ticket(int ticketNum) {
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Ticket() {
        // To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getTicketQty() {
        return TicketQty;
    }

    public void setTicketQty(int TicketQty) {
        this.TicketQty = TicketQty;
    }

//    public int getTicketQty() {
  //      return TicketQty;
    //}

    //public void setTicketQty(int TicketQty) {
      //  this.TicketQty = TicketQty;
    //}

    //@Override
    //public void sellCopy() {
    //}

    //@Override
    //public void getPrice() {
    //}

    @Override
    public void sellCopy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}