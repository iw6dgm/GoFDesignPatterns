/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package State;

/**
 *
 * @author joshua
 */
public class UpdatingHrState extends ClockState {

    public UpdatingHrState(Clock clock) {
        super(clock);
        System.out.println(
                "** UPDATING HR: Press CHANGE button to increase hours.");
    }

    @Override
    public void modeButton() {
        clock.setState(new UpdatingMinState(clock));
    }

    @Override
    public void changeButton() {
        clock.hr++;
        if (clock.hr == 24) {
            clock.hr = 0;
        }
        System.out.print("CHANGE pressed - ");
        clock.showTime();
    }
}
