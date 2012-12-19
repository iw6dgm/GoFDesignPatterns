/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj;

/**
 *
 * @author joshua
 */
class LightOnCommand implements Command {

    private Light myLight;

    public LightOnCommand(Light L) {
        myLight = L;
    }

    @Override
    public void execute() {
        myLight.turnOn();
    }
}
