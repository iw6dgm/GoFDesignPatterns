/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class TapeDevicesFactory implements DevicesFactory {

    @Override
    public Player createPlayer() {
        return new TapePlayer();
    }

    @Override
    public Recorder createRecorder() {
        return new TapeRecorder();
    }

    @Override
    public Media createMedia() {
        return new Tape();
    }
}
