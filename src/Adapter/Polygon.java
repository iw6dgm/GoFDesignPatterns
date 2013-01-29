/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Adapter;

/**
 *
 * @author joshua
 */
public interface Polygon {

    public void define(float x0, float y0, float x1, float y1,
            String color);

    public float[] getCoordinates();

    public float getSurface();

    public void setId(String id);

    public String getId();

    public String getColor();
}
