/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author joshua
 */
public class SequentialPoint implements DiagonalDraggablePoint {

    private int x, y;

    public SequentialPoint() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void moveDiagonal(int distance, String draggerName) {
        int aux = x + distance;
        System.out.println("Moved by " + draggerName
                + " - Origin x=" + x + " y=" + y);
        x = aux;
        y = y + distance;
    }

    @Override
    public void currentPosition() {
        System.out.println("Current position : x=" + x + " y=" + y);
    }
}
