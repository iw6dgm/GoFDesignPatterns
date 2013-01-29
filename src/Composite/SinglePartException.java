/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Composite;

/**
 *
 * @author joshua
 */
class SinglePartException extends Exception {

    public SinglePartException() {
        super("Not supported method");
    }
}
