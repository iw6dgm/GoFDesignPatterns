/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package State;

/**
 *
 * @author joshua
 */
public class UpdatingMinState extends ClockState {

    public UpdatingMinState(Clock clock) {
        super(clock);
        System.out.println(
                "** UPDATING MIN: Press CHANGE button to increase minutes.");
    }

    @Override
    public void modeButton() {
        clock.setState(new NormalDisplayState(clock));
    }

    @Override
    public void changeButton() {
        clock.min++;
        if (clock.min == 60) {
            clock.min = 0;
        }
        System.out.print("CHANGE pressed - ");
        clock.showTime();
    }
}
