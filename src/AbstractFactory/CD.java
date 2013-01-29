/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
