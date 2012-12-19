/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
