/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
