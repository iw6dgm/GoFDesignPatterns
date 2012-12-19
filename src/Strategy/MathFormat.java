/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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