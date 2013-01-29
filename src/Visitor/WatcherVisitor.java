/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author joshua
 */
public class WatcherVisitor implements Visitor {

    @Override
    public void visit(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable) {
                ((Visitable) o).accept(this);
            } else if (o instanceof Collection) {
                visit((Collection) o);
            }
        }
    }

    @Override
    public void visit(VisitableString vString) {
        System.out.println("’" + vString.getString() + "’");
    }

    @Override
    public void visit(VisitableFloat vFloat) {
        System.out.println(vFloat.getFloat().toString() + "f");
    }

}