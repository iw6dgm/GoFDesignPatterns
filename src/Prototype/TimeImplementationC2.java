/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Prototype;

/**
 *
 * @author joshua
 */
public class TimeImplementationC2 extends CloneableTime {

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
    }

    @Override
    public int getSeconds() {
        return secs % 60;
    }
}
