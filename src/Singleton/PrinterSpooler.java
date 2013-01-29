/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Singleton;

/**
 *
 * @author joshua
 */
public class PrinterSpooler {

    private static PrinterSpooler instance;

    private PrinterSpooler() {
    }

    public static synchronized PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    public void print(String msg) {
        System.out.println(msg);
    }
}
