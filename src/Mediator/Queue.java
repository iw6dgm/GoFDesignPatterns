/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Mediator;

/**
 *
 * @author joshua
 */
public class Queue extends BankEntity {

    private int size;

    public Queue(BankServiceOrganizer bso) {
        super(bso);
    }

    public void enqueue() {
        size++;
        changed();
    }

    public void dequeue() {
        if (size > 0) {
            size--;
        }
    }

    public int getSize() {
        return size;
    }
}
