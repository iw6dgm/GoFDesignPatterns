/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Prototype;

/**
 *
 * @author joshua
 */
public class SchedulerC {

    public static CloneableTime calculateEnd(CloneableTime start, int hours)
            throws CloneNotSupportedException {
        int hr = start.getHours() + hours;
        hr = hr < 24 ? hr : hr - 24;
        CloneableTime endTime = start.cloneItself();
        endTime.setTime(hr, start.getMinutes(), start.getSeconds());
        return endTime;
    }
}
