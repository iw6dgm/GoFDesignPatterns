/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Visitor;

import java.util.Collection;

/**
 *
 * @author joshua
 */
public interface Visitor {
    public void visit(Collection collection);

    public void visit(VisitableString string);

    public void visit(VisitableFloat nFloat);  
}
