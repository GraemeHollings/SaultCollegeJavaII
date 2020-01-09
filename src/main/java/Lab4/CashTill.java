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
public abstract class CashTill implements SaleableItem {
    
    public String items;
    public String SubTotal;
    
    public CashTill()
    {
    
    }
    
    public void setItems()
    {
        this.items = items;
    }
    
    public String getItems()
    {
        return items;
    }

    public void setSubTotal(String SubTotal) {
        this.SubTotal = SubTotal;
    }

    public String getSubTotal() {
        return SubTotal;
    }
 
}
