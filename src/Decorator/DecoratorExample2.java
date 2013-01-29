/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Decorator;

/**
 *
 * @author joshua
 */
public class DecoratorExample2 {

    public static void main(String[] arg) {
        System.out.println("Non synchronized point:");
        DiagonalDraggablePoint p = new SequentialPoint();
        PointDragger mp1 = new PointDragger(p, "Thread 1");
        PointDragger mp2 = new PointDragger(p, "Thread 2");
        Thread t1 = new Thread(mp1);
        Thread t2 = new Thread(mp2);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive());
        p.currentPosition();
        System.out.println("Synchronized point:");
        p = new SynchronizedPoint(new SequentialPoint());
        mp1 = new PointDragger(p, "Thread 1");
        mp2 = new PointDragger(p, "Thread 2");
        t1 = new Thread(mp1);
        t2 = new Thread(mp2);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive());
        p.currentPosition();
    }
}
