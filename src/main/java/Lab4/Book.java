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
public class Book extends Publication{

    public String name;
    public String author;
    public int quant;
    
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
        setPrice(price);
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
     
      @Override
    public String toString() {
        
        return "Name :"+" "+name+ "\n";
        
    }

    
    public void orderCopies() 
    {
    
    }
    
    
}
    
    
    

