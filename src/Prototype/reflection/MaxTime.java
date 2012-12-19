/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.reflection;

/**
 *
 * @author joshua
 */
public class MaxTime implements Time {

    @Override
    public void setTime(int hr, int min, int sec) {
// Does nothing
    }

    @Override
    public int getHours() {
        return 23;
    }

    @Override
    public int getMinutes() {
        return 59;
    }

    @Override
    public int getSeconds() {
        return 59;
    }
}
