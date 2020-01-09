/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author 17009434
 */
public class App {
            private final int NUM_BOOKS = 15;
    
   private Ticket[] tickets = new Ticket[100];
   private int currentTicket = 0;
            
    private Book[] books = new Book[NUM_BOOKS];
    private int currentBook = 0;
    
    private Book[] edit = new Book[NUM_BOOKS];
    
    
    private Magazine[] mags = new Magazine[NUM_BOOKS];
    private int currentMagazine = 0;
    
    private int[] pencil = new int[100];
    
    public void run() {
    boolean quit = false;
  
   
    String mainMenu = "----------------------\n" 
            +"1. " + "Books\n"
            +"2.  " + "Tickets\n"
            +"3. " + "Magazines\n";
    
   
     Scanner input = new Scanner(System.in);
   
    while(!quit){
  
   
    
   System.out.println("----------------------");
   System.out.println(mainMenu);
   int choice = input.nextInt();
   
    switch(choice)
    {
        case 1:
            books();
            break; 
        
        case 2:     
            tickets();
            break;
        case 3:    
            magazines();
            break;
        
     }  
    }
 }
 
    public void books(){
    
     Scanner input = new Scanner(System.in);   
        
     listBooks();   
     String booksMenu =  "3. " + "Add a Book.\n" 
            + "4. " + "Edit a Book.\n"
            + "5. " + "Delete a Book\n"
            + "6. " + "Quit.";   
        
        
    System.out.println(booksMenu);
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
        
     }  
    
    
    
    }
    
    public void tickets()
    {
        String ticketsMenu = "-----------Tickets-----------\n" 
            +"1. " + "Add a new ticket\n"
            +"2.  " + "Sell a ticket\n"
            +"3. " + "Sell a pencil\n";
        
        System.out.println(ticketsMenu);
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice)
    {
        case 1:
            addTicket();
            break; 
        
        case 2:     
            sellTicket();
            break;
        case 3:    
            sellPencils();
            break;
        
     } 
    }
    
    public void magazines()
    {
    listMagazine();
     Scanner input = new Scanner(System.in);   
    String magMenu =  "3. " + "Add a Magazine.\n" 
            + "4. " + "Edit a Magazine.\n"
            + "5. " + "Delete a Magazine\n"
            + "6. " + "Quit.";   
    System.out.println(magMenu);
     int choice = input.nextInt();
      switch(choice)
    {
        case 3:
            addMagazine();
            break; 
        
        case 4:     
            editMagazine();
            break;
        case 5:    
            deleteMagazine();
            break;
        
     } 
    
    }
    
    public void addMagazine()
    {
    try {
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Add Magazine");
        System.out.println("----------------------");
        System.out.println("Enter Magazine Name: ");
        String name = input.next();
        
        System.out.println("Enter Current Issue: ");
        int issue = input.nextInt();
        
        System.out.println("Enter Quantity: ");
        int quant = input.nextInt();
        
        Magazine magazine_make = new Magazine(name, issue, quant);
        mags[currentMagazine] = magazine_make;
        
        currentMagazine++;
        
        } catch(Exception e) {
            System.out.println("Error adding a new magazine");
        }
    
    }
    
    public void editMagazine()
    {
        Scanner input = new Scanner(System.in);
       listMagazine();
       System.out.println("----------------------");
       System.out.println("What magazine(s) would you like to edit?" + "\n" + "(enter the numeric value for the magazine listed.)\n");
       int edit = input.nextInt();
       System.out.println(mags[edit - 1]);
      System.out.println("What would you like to edit about this magazine?");
      
      String mainMenu = ""
                + "1. Name\n"
                + "2. Issue\n"
                + "3. Quantity\n";
              
     System.out.println(mainMenu);
        
     int mag_edit = input.nextInt();   
    
     
             switch (mag_edit) {
            case 1:
                System.out.println("Enter the new title. ");
                String new_title = input.next();
                mags[edit - 1].setName(new_title);
                break;

            case 2:
                System.out.println("Enter the new issue. ");
                int new_issue = input.nextInt();
                mags[edit - 1].setcurrIssue(new_issue);
                break;
                
             case 3:
                System.out.println("Enter the new quantity. ");
                int new_quant = input.nextInt();
                mags[edit - 1].setOrderQty(new_quant);
                break;  
            
            default:
                System.out.println("Invalid entry, try again. ");
             }
    }
    
    public void deleteMagazine()
    {
    Scanner input = new Scanner(System.in);
        listMagazine();
        System.out.println("Enter the numeric value of the magazine you would like to delete 7");
        int delete = input.nextInt();
        mags[delete - 1] = null;
    
    }
   
   
    public void addTicket()
    {
        try {
        Scanner input = new Scanner(System.in);
        Ticket ticketstand = new Ticket();
        System.out.println("Add Ticket");
        System.out.println("----------------------");
        System.out.println("Enter Ticket number: ");
        int ticketNum = input.nextInt();
        
        
        Ticket ticketInstance = new Ticket(ticketNum);
        tickets[currentTicket] = ticketInstance;
        
        currentTicket++;
        
        } catch(Exception e) {
            System.out.println("Error adding a new ticket");
        }   
    }
    
    public void sellTicket()
    {
    Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the numeric value of the ticket you would like to delete 7");
        int delete = input.nextInt();
       tickets[delete - 1] = null;
    }
    
    public void sellPencils()
    {
        try{
        Scanner input = new Scanner(System.in);
        
        
      
        } catch(Exception e)
        {System.out.println("error selling this pencil"); }
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
    
     public void listMagazine()
    {
        
        System.out.println("----------Magazines-----------");
   
        for (int i = 0; i < currentMagazine; i++ )
        {
            System.out.println(currentMagazine + ". " + mags[i]);
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
