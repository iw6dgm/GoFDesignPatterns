/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public interface DevicesFactory {

    public Player createPlayer();

    public Recorder createRecorder();

    public Media createMedia();
}
