/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class CDDevicesFactory implements DevicesFactory {

    @Override
    public Player createPlayer() {
        return new CDPlayer();
    }

    @Override
    public Recorder createRecorder() {
        return new CDRecorder();
    }

    @Override
    public Media createMedia() {
        return new CD();
    }
}
