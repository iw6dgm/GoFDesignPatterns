/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author joshua
 */
public class Watcher implements Observer {

    private int changes = 0;

    @Override
    public void update(Observable obs, Object arg) {
        System.out.println("Watcher : I see that the Subject holds now a "
                + ((ObservedSubject) obs).returnValue() + ".");
        changes++;
    }

    public int observedChanges() {
        return changes;
    }
}