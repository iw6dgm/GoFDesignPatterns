/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Mediator;

/**
 *
 * @author joshua
 */
public class LittleBankServiceOrganizer implements BankServiceOrganizer {

    private Queue queue1, queue2;
    private Teller teller1, teller2;

    public void createBankEntities() {
        queue1 = new Queue(this);
        queue2 = new Queue(this);
        teller1 = new Teller(this);
        teller2 = new Teller(this);
    }

    @Override
    public void entityChanged(BankEntity entityChanged) {
        if (entityChanged == teller1) {
            if (queue1.getSize() > 0) {
                teller1.initService(queue1);
            } else if (queue2.getSize() > 0) {
                teller1.initService(queue2);
            }
        } else if (entityChanged == teller2) {
            if (queue2.getSize() > 0) {
                teller2.initService(queue2);
            } else if (queue1.getSize() > 0) {
                teller2.initService(queue1);
            }
        } else if (entityChanged == queue1) {
            if (teller1.isFree()) {
                teller1.initService(queue1);
            } else if (teller2.isFree()) {
                teller2.initService(queue1);
            }
        } else if (entityChanged == queue2) {
            if (teller2.isFree()) {
                teller2.initService(queue2);
            } else if (teller1.isFree()) {
                teller1.initService(queue2);
            }
        }
    }

    public Queue getQueue1() {
        return queue1;
    }

    public Queue getQueue2() {
        return queue2;
    }

    public Teller getTeller1() {
        return teller1;
    }

    public Teller getTeller2() {
        return teller2;
    }
}
