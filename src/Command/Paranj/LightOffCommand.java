/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj;

/**
 *
 * @author joshua
 */
class LightOffCommand implements Command {

    private Light myLight;

    public LightOffCommand(Light L) {
        myLight = L;
    }

    @Override
    public void execute() {
        myLight.turnOff();
    }
}
