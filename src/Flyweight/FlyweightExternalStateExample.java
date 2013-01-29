/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Flyweight;

/**
 *
 * @author joshua
 */
public class FlyweightExternalStateExample {

    public static void main(String[] arg) {
        System.out.println("Exemplifies the external state usage.");
        EventSymbol evnt;
        for (int i = 0; i < 10; i++) {
            String owner = Math.random() < .5 ? "Generator A" : "Generator B";
            double r = Math.random();
            if (r < .3) {
                evnt = EventSymbolFactory.newEventSymbol("EVENT 1");
            } else if (r < .6) {
                evnt = EventSymbolFactory.newEventSymbol("EVENT 2");
            } else {
                evnt = EventSymbolFactory.newEventSymbol("EVENT 3");
            }
            evnt.print(owner);
        }
    }
}
