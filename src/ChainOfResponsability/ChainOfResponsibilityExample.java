/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package ChainOfResponsability;

/**
 *
 * @author joshua
 */
public class ChainOfResponsibilityExample {

    public static void main(String[] arg)
            throws CreditRequestHandlerException {
        ClientAccountManager clientAccountMgr =
                new ClientAccountManager();
        SalesManager salesMgr = new SalesManager();
        Vendor vendor = new Vendor();
        vendor.setSuperiorRequestHandler(salesMgr);
        salesMgr.setSuperiorRequestHandler(clientAccountMgr);
        Customer customer = new Customer();
        int i = 500;
        while (i <= 2500) {
            System.out.println("Credit request for : $" + i);
            customer.requestCredit(vendor, i);
            i += 500;
        }
    }
}
