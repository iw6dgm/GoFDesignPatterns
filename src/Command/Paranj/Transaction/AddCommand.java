/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj.Transaction;

/**
 *
 * @author joshua
 */
class AddCommand extends TransactionCommand {

    private CommandReceiver cr;

    public AddCommand() {
        cr = CommandReceiver.getHandle();
    }

    @Override
    public void execute() {
        cr.methAdd();
    }
}
