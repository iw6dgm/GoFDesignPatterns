/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author joshua
 */
class TVPowerCommand implements Command {

    private TV theTV;

    public TVPowerCommand(TV someTV) {
        theTV = someTV;
    }

    @Override
    public void execute() {
        theTV.power();
    }
}