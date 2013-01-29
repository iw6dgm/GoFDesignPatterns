/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package FactoryMethod;

/**
 *
 * @author joshua
 */
public interface MapElement {

    public abstract void setLabel(String id);

    public abstract String getPaintingData();
}
