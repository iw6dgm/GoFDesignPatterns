/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Prototype.reflection;

/**
 *
 * @author joshua
 */
public class TimeFactoryException extends Exception {

    public TimeFactoryException(Exception e) {
        super(e.getMessage());
    }
}
