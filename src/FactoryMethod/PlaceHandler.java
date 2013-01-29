/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package FactoryMethod;

/**
 *
 * @author joshua
 */
public class PlaceHandler extends ElementHandler {

    @Override
    public MapElement newElement() {
        return new Place();
    }
}
