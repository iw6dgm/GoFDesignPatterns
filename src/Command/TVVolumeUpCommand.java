/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author joshua
 */
class TVVolumeUpCommand implements Command {

    private TV theTV;

    public TVVolumeUpCommand(TV someTV) {
        theTV = someTV;
    }

    @Override
    public void execute() {
        theTV.volumeUp();
    }
}