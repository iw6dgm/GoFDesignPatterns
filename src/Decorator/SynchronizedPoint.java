/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Decorator;

/**
 *
 * @author joshua
 */
public class SynchronizedPoint implements DiagonalDraggablePoint {

    DiagonalDraggablePoint theSequentialPoint;

    public SynchronizedPoint(DiagonalDraggablePoint np) {
        theSequentialPoint = np;
    }

    @Override
    public void moveDiagonal(int distance, String draggerName) {
        synchronized (theSequentialPoint) {
            theSequentialPoint.moveDiagonal(distance, draggerName);
        }
    }

    @Override
    public void currentPosition() {
        theSequentialPoint.currentPosition();
    }
}
