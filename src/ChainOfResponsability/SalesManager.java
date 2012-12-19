/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author joshua
 */
public class SalesManager extends CreditRequestHandler {

    @Override
    public void creditRequest(int amount)
            throws CreditRequestHandlerException {
        if (amount <= 1000) {
            if (Math.random() < .3) {
                System.out.println("Accepted by Sales Manager.");
            } else {
                System.out.println("Not accepted by Sales Manager.");
            }
        } else {
            forwardCreditRequest(amount);
        }
    }
}
