/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.Example2;

/**
 *
 * @author joshua
 */
class Internet implements Observer {

    @Override
    public void update(float interest) {
        System.out.println("Internet: Interest Rate updated, new Rate is: "
                + interest);
    }
}
