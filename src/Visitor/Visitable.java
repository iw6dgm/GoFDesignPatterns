/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Visitor;

/**
 *
 * @author joshua
 */
public interface Visitable {
    public void accept(Visitor visitor);  
}
