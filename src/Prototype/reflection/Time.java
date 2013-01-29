/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Prototype.reflection;

/**
 *
 * @author joshua
 */
public interface Time {

    public void setTime(int hr, int min, int sec);

    public int getHours();

    public int getMinutes();

    public int getSeconds();
}
