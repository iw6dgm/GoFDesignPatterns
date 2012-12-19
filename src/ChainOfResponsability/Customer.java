/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author joshua
 */
public class Customer {

    public void requestCredit(CreditRequestHandler crHandler, int amount)
            throws CreditRequestHandlerException {
        crHandler.creditRequest(amount);
    }
}
