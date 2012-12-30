/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
