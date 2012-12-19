/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
