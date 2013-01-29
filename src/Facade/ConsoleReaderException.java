/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Facade;

/**
 *
 * @author joshua
 */
public class ConsoleReaderException extends RuntimeException {

    public ConsoleReaderException(Exception e) {
        super(e.toString());
    }
}
