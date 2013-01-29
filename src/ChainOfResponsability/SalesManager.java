/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
