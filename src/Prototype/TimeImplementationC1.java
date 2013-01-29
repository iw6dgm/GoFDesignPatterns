/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Prototype;

/**
 *
 * @author joshua
 */
public class TimeImplementationC1 extends CloneableTime {

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
