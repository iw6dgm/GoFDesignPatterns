/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj.Transaction;

import java.util.Vector;

/**
 *
 * @author joshua
 */
public class TestTransactionCommand {

    private Vector clist, alist;

    public TestTransactionCommand() {
        clist = new Vector();
        alist = new Vector();
    }

    public void clearBuffer(Vector c, Vector a) {
        clist.removeAll(c);
        alist.removeAll(a);
    }

    public Vector getClist() {
        return clist;
    }

    public Vector getAlist() {
        return alist;
    }

    public static void main(String[] args) {
        CommandArgument ca, ca2;
        TestTransactionCommand t = new TestTransactionCommand();
        ca = new CommandArgument();
        ca.setArgument(2, 8);
        Vector myclist = t.getClist();
        Vector myalist = t.getAlist();
        myclist.addElement("Add");
        myalist.addElement(ca);
        TransactionCommand tc = new TransactionCommand(myclist, myalist);
        CommandManager cm = new CommandManager(tc);
        cm.runCommands();
        t.clearBuffer(myclist, myalist);
        ca2 = new CommandArgument();
        ca2.setArgument(5, 7);
        myclist = t.getClist();
        myalist = t.getAlist();
        myclist.addElement("Subtract");
        myalist.addElement(ca2);
        myclist.addElement("Add");
        myalist.addElement(ca2);
        TransactionCommand tc2 = new TransactionCommand(myclist, myalist);
        CommandManager cm2 = new CommandManager(tc2);
        cm2.runCommands();
    }
}
