/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
