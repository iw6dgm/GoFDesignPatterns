/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
