/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
