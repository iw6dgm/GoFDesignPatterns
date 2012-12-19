/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.Example2;

/**
 *
 * @author joshua
 */
interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
