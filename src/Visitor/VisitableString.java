/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author joshua
 */
public class VisitableString implements Visitable {

    private String value;

    public VisitableString(String string) {
        value = string;
    }

    public String getString() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}