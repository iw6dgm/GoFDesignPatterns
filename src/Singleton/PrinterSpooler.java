/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
