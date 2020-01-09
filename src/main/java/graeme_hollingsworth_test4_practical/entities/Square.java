package graeme_hollingsworth_test4_practical.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author 17009434
 */
@Entity
public class Square extends Shape {

    @Basic
    private double theLength;

    @Basic
    private double width;

    public double getTheLength() {
        return theLength;
    }

    public void setTheLength(double theLength) {
        this.theLength = theLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void printArea() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}