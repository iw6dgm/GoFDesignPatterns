/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author joshua
 */
class Place implements MapElement {

    private String placeLabel;

    @Override
    public void setLabel(String label) {
        placeLabel = label;
    }

    @Override
    public String getPaintingData() {
        return "city: " + placeLabel;
    }
}
