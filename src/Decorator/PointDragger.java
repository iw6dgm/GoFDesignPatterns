/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Decorator;

/**
 *
 * @author joshua
 */
class PointDragger implements Runnable {

    DiagonalDraggablePoint point;
    String name;

    public PointDragger(DiagonalDraggablePoint p, String nom) {
        point = p;
        name = nom;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            point.moveDiagonal(1, name);
        }
    }
}
