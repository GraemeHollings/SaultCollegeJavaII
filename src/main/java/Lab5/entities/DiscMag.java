package Lab5.entities;

import javax.persistence.Entity;

/**
 * @author 17009434
 */

@Entity
public class DiscMag extends Magazine {

    public DiscMag(String name, int sue, int quant) {
        super(name, sue, quant);
    }

}