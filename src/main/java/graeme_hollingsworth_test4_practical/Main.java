/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graeme_hollingsworth_test4_practical;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import graeme_hollingsworth_test4_practical.entities.*;

/**
 *
 * @author 17009434
 */
public class Main {
    
  public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
       


        try {
            emf = Persistence.createEntityManagerFactory("graeme_hollingsworth_test4_PU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            //////////////
            Square square=new Square();
            square.setTheLength(10.5);
            square.setWidth(20);
            square.printArea();
            em.persist(square);
            ////////////////////
            em.getTransaction().commit();
            
           // SquareJpaController squareJpaController=new SquareJpaController(emf);
            //List<Square> squares = squareJpaController.findSquareEntities();
            //for(Square b:squares){
             //   b.printArea();
            //}
            
            
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (emf != null) {
                emf.close();
            }
    }
    }
}
    