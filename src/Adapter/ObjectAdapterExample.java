/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Adapter;

/**
 *
 * @author joshua
 */
public class ObjectAdapterExample {

    public static void main(String[] arg) {
        Polygon block = new RectangleObjectAdapter();
        block.setId("Demo");
        block.define(3, 4, 10, 20, "RED");
        System.out.println("The area of " + block.getId() + " is "
                + block.getSurface() + ", and it’s "
                + block.getColor());
    }
}
