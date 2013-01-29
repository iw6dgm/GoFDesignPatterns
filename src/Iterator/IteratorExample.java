/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author joshua
 */
public class IteratorExample {

    public static void main(String[] arg) {
        LinkedList tour = new LinkedList();
        tour.add("Santiago");
        tour.add("Buenos Aires");
        tour.add("Atlanta");
        tour.add("New York");
        tour.add("Madrid");
        tour.add("Torino");
        tour.add("Napoli");
        ListIterator travel = tour.listIterator();
        System.out.println("Percorso andata");
        while (travel.hasNext()) {
            System.out.println(((String) travel.next()));
        }
        System.out.println("Percorso ritorno");
        while (travel.hasPrevious()) {
            System.out.println(((String) travel.previous()));
        }
    }
}