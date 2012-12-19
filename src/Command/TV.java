/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author joshua
 */
public class TV {

    public static final int ON = 1;
    public static final int OFF = 0;
    private int power = OFF;
    private int volume = 0;
    private int channel = 2;

    public void power() {
        if (power == OFF) {
            power = ON;
            System.out.println("The TV is ON.");
        } else {
            power = OFF;
            System.out.println("The TV is OFF.");
        }
    }

    public void volumeUp() {
        if (power == ON) {
            if (volume < 10) {
                volume++;
            }
            System.out.println("Current volume level is " + volume);
        } else {
            System.out.println("You must turn on the TV.");
        }
    }

    public void volumeDown() {
        if (power == ON) {
            if (volume > 0) {
                volume--;
            }
            System.out.println("Current volume level is " + volume);
        } else {
            System.out.println("You must turn on the TV.");
        }
    }

    public void setChannel(int ch) {
        if (power == ON) {
            if (ch >= 2 && ch < 140) {
                channel = ch;
            }
            System.out.println("Current channel is " + channel);
        } else {
            System.out.println("You must turn on the TV.");
        }
    }
}
