/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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