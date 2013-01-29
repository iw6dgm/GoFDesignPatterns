/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public interface Player {
    public void accept(Media med);

    public void play();

}
