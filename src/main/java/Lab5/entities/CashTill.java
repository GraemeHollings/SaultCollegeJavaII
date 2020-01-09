package Lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author 17009434
 */

@Entity
public class CashTill extends Publication {

    @Basic
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public void sellCopy() {
    }

    @Override
    public void getPrice() {
    }

}