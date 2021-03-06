/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class TapeRecorder implements Recorder {

    Tape tapeInside;

    @Override
    public void accept(Media med) {
        tapeInside = (Tape) med;
    }

    @Override
    public void record(String sound) {
        if (tapeInside == null) {
            System.out.println("Error: Insert a tape.");
        } else {
            tapeInside.saveOnTape(sound);
        }
    }
}
