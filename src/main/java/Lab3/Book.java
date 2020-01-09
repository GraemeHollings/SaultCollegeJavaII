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
public class Book {

    public String name;
    public String author;
    public int quant;
    public float price;
    
    public Book()
    {
    
    }
    
    public Book(String name)
    {
    this.name = name;
        
    }
    
     public Book(String name, String author)
    {
     this.name = name;
    this.author = author;
        
    }
    
    
    public Book(String name,String author, int quant, float price)
    {
    this.name = name; 
    this.author = author;
    this.quant = quant;
    this.price = price;
   }
    
    
    
    
    
    public void setAuthor(String author)
    {
        this.author = author;
    
    }
    public String getAuthor() 
    {
        return author;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
      public void setQuant(int quant)
    {
        this.quant = quant;
    }
    
      public int getQuant()
    {
          return quant;
    }
    public void setPrice(float quant)
    {
        this.price = price;
    }
    
    public float getPrice()
    {
        return price;
    }
      
      
      
      @Override
    public String toString() {
        
        return "Name :"+" "+name+ "\n";
        
    }

    
    public void orderCopies() 
    {
    
    }
    
    
}
    
    
    

