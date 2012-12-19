/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class Tape implements Media {

    private String tape = "";

    public void saveOnTape(String sound) {
        tape = sound;
    }

    public String readTape() {
        return tape;
    }
}
