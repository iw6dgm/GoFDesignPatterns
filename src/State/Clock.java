/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author joshua
 */
public class Clock {

    private ClockState clockState;
    public int hr, min;

    public Clock() {
        clockState = new NormalDisplayState(this);
    }

    public void setState(ClockState cs) {
        clockState = cs;
    }

    public void modeButton() {
        clockState.modeButton();
    }

    public void changeButton() {
        clockState.changeButton();
    }

    public void showTime() {
        System.out.println("Current time is Hr : " + hr + " Min: "
                + min);
    }
}
