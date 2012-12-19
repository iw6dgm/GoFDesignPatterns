/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj.Transaction;

/**
 *
 * @author joshua
 */
class SubtractCommand extends TransactionCommand {

    private CommandReceiver cr;

    public SubtractCommand() {
        cr = CommandReceiver.getHandle();
    }

    @Override
    public void execute() {
        cr.methSubtract();
    }
}
