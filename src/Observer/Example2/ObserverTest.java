/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.Example2;

/**
 *
 * @author joshua
 */
public class ObserverTest {

    public static void main(String args[]) {
        // this will maintain all loans information
        Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();

        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                "Standard Charterd");
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.setInterest(3.5f);

    }
}
