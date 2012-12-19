/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Observable;

/**
 *
 * @author joshua
 */
public class ObservedSubject extends Observable {

    private int value = 0;

    public void receiveValue(int newNumber) {
        if (Math.random() < .5) {
            System.out.println("Subject : I like it, I’ve changed my "
                    + "internal value.");
            value = newNumber;
            this.setChanged();
        } else {
            System.out.println("Subject : I have a number " + value
                    + " now, and I not interested in the number "
                    + newNumber + ".");
        }
        this.notifyObservers();
    }

    public int returnValue() {
        return value;
    }
}