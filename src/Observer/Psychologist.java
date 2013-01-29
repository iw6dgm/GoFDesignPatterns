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
public class Psychologist implements Observer {

    private int countLower, countHigher = 0;

    @Override
    public void update(Observable obs, Object arg) {
        int value = ((ObservedSubject) obs).returnValue();
        if (value <= 5) {
            countLower++;
        } else {
            countHigher++;
        }
    }

    public String opinion() {
        float media;
        if ((countLower + countHigher) == 0) {
            return ("The Subject doesn’t like changes.");
        } else if (countLower > countHigher) {
            return ("The Subject likes little numbers.");
        } else if (countLower < countHigher) {
            return ("The Subject likes big numbers.");
        } else {
            return ("The Subject likes little numbers and big numbers.");
        }
    }
}