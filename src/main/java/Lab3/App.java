/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author 17009434
 */
public class App {
    
    private final int NUM_BOOKS = 15;
    
    private Book[] books = new Book[NUM_BOOKS];
    private int currentBook = 0;
    
    private Book[] edit = new Book[NUM_BOOKS];
    
    public void run() {
    boolean quit = false;
  

    String secondaryMenu =  "3. " + "Add a Book.\n" 
            + "4. " + "Edit a Book.\n"
            + "5. " + "Delete a Book\n"
            + "6. " + "Quit.";
    
     Scanner input = new Scanner(System.in);
   
    while(!quit){
    listBooks(); 
   System.out.println("----------------------");
   System.out.println(secondaryMenu);
   int choice = input.nextInt();
   
    switch(choice)
    {
        case 3:
            addBook();
            break;
        case 4:
            editBook();
          break;
        case 5:
           deleteBooks();
           break;
        case 6: 
           System.exit(0);
           break;
     }  
    
   
 
    
    
    }
 }
 
    public void addBook()
    {
        
        try {
        
        Scanner input = new Scanner(System.in);
        Book bookshelf = new Book();
        System.out.println("Add Book");
        System.out.println("----------------------");
        System.out.println("Enter Book Name: ");
        String name = input.next();
        
        System.out.println("Enter Author: ");
        String author = input.next();
        
        System.out.println("Enter Quantity: ");
        int quant = input.nextInt();
        
        System.out.println("Enter Price: ");
        float price = input.nextFloat();
        
        Book book_make = new Book(name, author, quant, price);
        books[currentBook] = book_make;
        
        currentBook++;
        
        } catch(Exception e) {
            System.out.println("Error adding a new book");
        }
    }
    
    public void editBook()
    {
       Scanner input = new Scanner(System.in);
       listBooks();
       System.out.println("----------------------");
       System.out.println("What book(s) would you like to edit?" + "\n" + "(enter the numeric value for the book listed.)\n");
       int edit = input.nextInt();
       System.out.println(books[edit - 1]);
      System.out.println("What would you like to edit about this book?");
      
      String mainMenu = ""
                + "1. Title\n"
                + "2. Author\n";
              
     System.out.println(mainMenu);
        
     int book_edit = input.nextInt();   
    
     
             switch (book_edit) {
            case 1:
                System.out.println("Enter the new title. ");
                String new_title = input.next();
                books[edit - 1].setName(new_title);
                break;

            case 2:
                System.out.println("Enter the new author. ");
                String new_author = input.next();
                books[edit - 1].setAuthor(new_author);
                break;
            
            default:
                System.out.println("Invalid entry, try again. ");
             }
     
    }
    
    
    
    
    
    public void listBooks()
    {
        
        System.out.println("----------Books-----------");
   
        for (int i = 0; i < currentBook; i++ )
        {
            System.out.println(currentBook + ". " + books[i]);
        }
    }
    
    public void deleteBooks()
    {
        Scanner input = new Scanner(System.in);
        listBooks();
        System.out.println("Enter the numeric value of the book you would like to delete 7");
        int delete = input.nextInt();
        books[delete - 1] = null;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
