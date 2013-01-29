/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
