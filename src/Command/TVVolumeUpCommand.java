/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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