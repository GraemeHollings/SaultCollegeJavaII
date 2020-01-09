/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author 17009434
 */
public class Magazine {
    
    public int orderQty;
    public int currIssue;
    
    // Constructors
    public Magazine()
    {
    
    }
    
    public Magazine(int orderQty, int currIssue)
    {
        this.orderQty = orderQty;
        this.currIssue = currIssue;
    }
    
    //setters, getters
    public void setOrderQty() 
    {
        this.orderQty = orderQty;
    }
    
    public int getOrderQty() 
    {
        return orderQty;
    }
    
    public void setcurrIssue()
    {
        this.currIssue = currIssue;
    }
    
    public int getCurrIssue()
    {
        return currIssue;
    }
    
    
    // Todo:
    public void adjustQty() 
    {
    
    
    }
    
    public void recvNewIssue()
    {
    
    }
    
    
    
}
