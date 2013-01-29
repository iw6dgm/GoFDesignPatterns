/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class TapePlayer implements Player {

    Tape tapeInside;

    @Override
    public void accept(Media med) {
        tapeInside = (Tape) med;
    }

    @Override
    public void play() {
        if (tapeInside == null) {
            System.out.println("Error: Insert a tape.");
        } else {
            System.out.println(tapeInside.readTape());
        }
    }
}
