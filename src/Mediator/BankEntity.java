/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Mediator;

/**
 *
 * @author joshua
 */
public abstract class BankEntity {

    BankServiceOrganizer bOrganizer;

    public BankEntity(BankServiceOrganizer bso) {
        bOrganizer = bso;
    }

    public void changed() {
        bOrganizer.entityChanged(this);
    }
}
