/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package State;

/**
 *
 * @author joshua
 */
public class StateExample {

    public static void main(String arg[]) {
        Clock theClock = new Clock();
        theClock.changeButton();
        theClock.modeButton();
        theClock.changeButton();
        theClock.changeButton();
        theClock.modeButton();
        theClock.changeButton();
        theClock.changeButton();
        theClock.changeButton();
        theClock.changeButton();
        theClock.modeButton();
    }
}
