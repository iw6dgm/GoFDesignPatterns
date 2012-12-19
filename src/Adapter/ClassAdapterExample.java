/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author joshua
 */
public class ClassAdapterExample {

    public static void main(String[] arg) {
        Polygon block = new RectangleClassAdapter();
        block.setId("Demo");
        block.define(3, 4, 10, 20, "RED");
        System.out.println("The area of " + block.getId() + " is "
                + block.getSurface() + ", and it’s "
                + block.getColor());
    }
}
