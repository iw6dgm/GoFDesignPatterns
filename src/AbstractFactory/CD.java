/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class CD implements Media {

    private String track = "";

    public void writeOnDisk(String sound) {
        track = sound;
    }

    public String readDisk() {
        return track;
    }
}
