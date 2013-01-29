/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joshua
 */
public class CommandExample {

    public static void main(String[] args) throws IOException {
        TV aCommonTV = new TV();
        Command tvpower = new TVPowerCommand(aCommonTV);
        Command tvVolUp = new TVVolumeUpCommand(aCommonTV);
        Command tvVolDn = new TVVolumeDownCommand(aCommonTV);
        Command tvSetCh = new TVSetChannelCommand(aCommonTV);
        UniversalRemoteControl remote =
                new UniversalRemoteControl(tvpower,
                tvVolUp,
                tvVolDn,
                tvSetCh);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nOption = 0;
        while (nOption != 9) {
            System.out.println("Select a button to press or 9 to exit");
            System.out.println("1.- POWER");
            System.out.println("2.- ARROW UP");
            System.out.println("3.- ARROW DOWN");
            System.out.println("4.- NUMERIC KEYPAD");
            nOption = Integer.parseInt(br.readLine());
            switch (nOption) {
                case 1:
                    remote.pressButtonPower();
                    break;
                case 2:
                    remote.pressButtonArrowUp();
                    break;
                case 3:
                    remote.pressButtonArrowDown();
                    break;
                case 4:
                    remote.pressKeypadToEnterNumber();
                    break;
            }
        }
    }
}
