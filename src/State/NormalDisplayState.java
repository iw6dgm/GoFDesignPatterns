/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package State;

/**
 *
 * @author joshua
 */
public class NormalDisplayState extends ClockState {

    public NormalDisplayState(Clock clock) {
        super(clock);
        System.out.println("** Clock is in normal display.");
    }

    @Override
    public void modeButton() {
        clock.setState(new UpdatingHrState(clock));
    }

    @Override
    public void changeButton() {
        System.out.print("LIGHT ON: ");
        clock.showTime();
    }
}
