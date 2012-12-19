/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author joshua
 */
public abstract class CreditRequestHandler {

    private CreditRequestHandler successor;

    public void setSuperiorRequestHandler(CreditRequestHandler theSuperior) {
        successor = theSuperior;
    }

    public void creditRequest(int amount)
            throws CreditRequestHandlerException {
        forwardCreditRequest(amount);
    }

    protected void forwardCreditRequest(int amount)
            throws CreditRequestHandlerException {
        if (successor != null) {
            successor.creditRequest(amount);
        } else {
            throw new CreditRequestHandlerException();
        }
    }
}
