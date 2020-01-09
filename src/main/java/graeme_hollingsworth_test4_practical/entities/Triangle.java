package graeme_hollingsworth_test4_practical.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author 17009434
 */
@Entity
public class Triangle extends Shape {

    @Basic
    private double base;

    @Basic
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void printArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}