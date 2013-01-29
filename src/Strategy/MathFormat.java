/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Strategy;

/**
 *
 * @author joshua
 */
public class MathFormat implements ArrayDisplayFormat {

    @Override
    public void printData(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr[ " + i + " ] = " + arr[i]);
        }
    }
}