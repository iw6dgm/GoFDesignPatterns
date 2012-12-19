/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.Example2;

/**
 *
 * @author joshua
 */
class Newspaper implements Observer {

    @Override
    public void update(float interest) {
        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
    }
}
