/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Strategy;

/**
 *
 * @author joshua
 */
public class StandardFormat implements ArrayDisplayFormat {

    @Override
    public void printData(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + " }");
    }
}