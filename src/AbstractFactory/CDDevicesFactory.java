/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
