/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author joshua
 */
public class ClientAccountManager extends CreditRequestHandler {

    @Override
    public void creditRequest(int amount)
            throws CreditRequestHandlerException {
        if (amount <= 2000) {
            if (Math.random() < .2) {
                System.out.println("Accepted by Client Account Manager.");
            } else {
                System.out.println("Not accepted by Client Account Manager.");
            }
        } else {
            forwardCreditRequest(amount);
        }
    }
}
