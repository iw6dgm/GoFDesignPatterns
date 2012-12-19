/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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