/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.reflection;

/**
 *
 * @author joshua
 */
public class TimeImplementationR2 implements Time {

    private int secs;

    @Override
    public void setTime(int hr, int min, int sec) {
        secs = hr * 3600 + min * 60 + sec;
    }

    @Override
    public int getHours() {
        return secs / 3600;
    }

    @Override
    public int getMinutes() {
        return (secs - getHours() * 3600) / 60;
// TODO: Add your code here
    }

    @Override
    public int getSeconds() {
        return secs % 60;
    }
}
