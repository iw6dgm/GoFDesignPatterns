/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author joshua
 */
public class Teller extends BankEntity {

    private boolean isFree;

    public Teller(BankServiceOrganizer bso) {
        super(bso);
        isFree = true;
    }

    public void initService(Queue q) {
        if (isFree) {
            q.dequeue();
            isFree = false;
        }
    }

    public void endService() {
        isFree = true;
        changed();
    }

    public boolean isFree() {
        return isFree;
    }
}
