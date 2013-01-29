/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
