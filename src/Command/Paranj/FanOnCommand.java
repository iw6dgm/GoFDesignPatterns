/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj;

/**
 *
 * @author joshua
 */
class FanOnCommand implements Command {

    private Fan myFan;

    public FanOnCommand(Fan F) {
        myFan = F;
    }

    @Override
    public void execute() {
        myFan.startRotate();
    }
}
