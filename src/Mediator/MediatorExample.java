/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Mediator;

/**
 *
 * @author joshua
 */
public class MediatorExample {
    public static void main(String[] arg) {
        LittleBank bank = new LittleBank();
        bank.showStatus();
        System.out.println("A customer arrives to queue 1");
        bank.customerArriveToQ1();
        bank.showStatus();
        System.out.println("A customer arrives to queue 1");
        bank.customerArriveToQ1();
        bank.showStatus();
        System.out.println("A customer arrives to queue 1");
        bank.customerArriveToQ1();
        bank.showStatus();
        System.out.println("A customer arrives to queue 2");
        bank.customerArriveToQ2();
        bank.showStatus();
        System.out.println("End of service teller 1");
        bank.endServiceTeller1();
        bank.showStatus();
        System.out.println("End of service teller 2");
        bank.endServiceTeller2();
        bank.showStatus();
        System.out.println("End of service teller 2");
        bank.endServiceTeller2();
        bank.showStatus();

    }
    
}
