/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class CDRecorder implements Recorder {

    CD cDInside;

    @Override
    public void accept(Media med) {
        cDInside = (CD) med;
    }
    
    @Override
public void record(String sound) {
        if (cDInside == null) {
            System.out.println("Error: No CD.");
        } else {
            cDInside.writeOnDisk(sound);
        }
    }
}
