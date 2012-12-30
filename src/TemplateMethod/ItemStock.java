/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author joshua
 */
public abstract class ItemStock {

    public final boolean remove(int quantity) {
        if (!validateQuantity(quantity)) {
            return false;
        }
        if (getCurrentStock() >= quantity) {
            decreaseStock(quantity);
            return true;
        }
        return false;
    }

    public abstract boolean validateQuantity(int quantity);

    public abstract int getCurrentStock();

    public abstract void decreaseStock(int quantity);
}
