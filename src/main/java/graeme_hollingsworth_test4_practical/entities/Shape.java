package graeme_hollingsworth_test4_practical.entities;

import graeme_hollingsworth_test4_practical.ShapeInterface;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 17009434
 */

@Entity
public abstract class Shape implements ShapeInterface {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private double area;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}