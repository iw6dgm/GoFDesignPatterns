/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package TemplateMethod;

/**
 *
 * @author joshua
 */
public class VeryRestrictedItem extends ItemStock {

    String code;
    String name;
    int currentQuantity;
    int maxLotSize;

    public VeryRestrictedItem(String cod, String nam, int mlSize) {
        code = cod;
        name = nam;
        maxLotSize = mlSize;
    }

    public void setStock(int quantity) {
        currentQuantity = quantity;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + currentQuantity
                + " (Max. Lot Size: " + maxLotSize + ")";
    }

    @Override
    public int getCurrentStock() {
        return currentQuantity;
    }

    @Override
    public void decreaseStock(int quantity) {
        currentQuantity -= quantity;
    }

    @Override
    public boolean validateQuantity(int quantity) {
        if (quantity >= 0
                && quantity <= Math.min(currentQuantity, maxLotSize)) {
            return true;
        }
        return false;
    }
}
