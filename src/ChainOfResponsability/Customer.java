/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
