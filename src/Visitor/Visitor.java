/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
