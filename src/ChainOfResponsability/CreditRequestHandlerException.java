/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package ChainOfResponsability;

/**
 *
 * @author joshua
 */
public class CreditRequestHandlerException extends Exception {

    public CreditRequestHandlerException() {
        super("No handler found to forward the request.");
    }
}
