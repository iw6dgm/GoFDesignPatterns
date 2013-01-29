/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class CDPlayer implements Player {

    CD cDInside;

    @Override
    public void accept(Media med) {
        cDInside = (CD) med;
    }

    @Override
    public void play() {
        if (cDInside == null) {
            System.out.println("Error: No CD.");
        } else {
            System.out.println(cDInside.readDisk());
        }
    }
}
