/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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