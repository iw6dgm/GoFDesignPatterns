/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
