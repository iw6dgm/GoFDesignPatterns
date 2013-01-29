/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Visitor;

/**
 *
 * @author joshua
 */
public class VisitableFloat implements Visitable {

    private Float value;

    public VisitableFloat(float f) {
        value = new Float(f);
    }

    public Float getFloat() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}