/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author joshua
 */
public class UniversalRemoteControl {

    private Command buttonPower,
            buttonArrowUp,
            buttonArrowDown,
            keypadToEnterNumber,
            buttonScan;

    public UniversalRemoteControl(Command pw, Command au,
            Command ad, Command nu) {
        buttonPower = pw;
        buttonArrowUp = au;
        buttonArrowDown = ad;
        keypadToEnterNumber = nu;
    }

    public void pressButtonPower() {
        buttonPower.execute();
    }

    public void pressButtonArrowUp() {
        buttonArrowUp.execute();
    }

    public void pressButtonArrowDown() {
        buttonArrowDown.execute();
    }

    public void pressKeypadToEnterNumber() {
        keypadToEnterNumber.execute();
    }

    /*public void pressBack() {
        keypadToEnterNumber.undo();
    }*/
}
