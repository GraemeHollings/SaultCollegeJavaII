/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author 17009434
 */
public class Magazine  extends Publication{
    
    public int orderQty;
    public int currIssue;
    public String name;
    
//    Publication p1 = new Publication() {};
    
    // Constructors
    public Magazine()
    {
    
    }

    
    
    public Magazine(String Name, int orderQty, int currIssue)
    {
        this.name = name;
        this.orderQty = orderQty;
        this.currIssue = currIssue;
        
    }
    
    //setters, getters
    public void setOrderQty(int orderQty) 
    {
        this.orderQty = orderQty;
    }
    
    public int getOrderQty() 
    {
        return orderQty;
    }
    
    public void setcurrIssue(int currIssue)
    {
        this.currIssue = currIssue;
    }
    
    public int getCurrIssue()
    {
        return currIssue;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        
        return "Name :"+" "+name+ "\n";
        
    }
    
    
    
    // Todo:
    public void adjustQty() 
    {
    
    
    }
    
    public void recvNewIssue()
    {
    
    }

    }
   
    
    

