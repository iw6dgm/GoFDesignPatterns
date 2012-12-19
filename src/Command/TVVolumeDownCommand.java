/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author joshua
 */
class TVVolumeDownCommand implements Command {

    private TV theTV;

    public TVVolumeDownCommand(TV someTV) {
        theTV = someTV;
    }

    @Override
    public void execute() {
        theTV.volumeDown();
    }
}