/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package State;

/**
 *
 * @author joshua
 */
public abstract class ClockState {

    protected Clock clock;

    public ClockState(Clock clock) {
        this.clock = clock;
    }

    public abstract void modeButton();

    public abstract void changeButton();
}
