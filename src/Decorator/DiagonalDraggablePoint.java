/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Decorator;

/**
 *
 * @author joshua
 */
public interface DiagonalDraggablePoint {

    public void moveDiagonal(int distance, String draggerName);

    public void currentPosition();
}
