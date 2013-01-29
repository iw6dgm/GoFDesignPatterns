/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Prototype.reflection;

/**
 *
 * @author joshua
 */
public class TimeImplementationR1 implements Time {

    private int hr, min, sec;

    @Override
    public void setTime(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    @Override
    public int getHours() {
        return hr;
    }

    @Override
    public int getMinutes() {
        return min;
    }

    @Override
    public int getSeconds() {
        return sec;
    }
}
