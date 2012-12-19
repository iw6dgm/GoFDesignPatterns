/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author joshua
 */
public class Constant implements BooleanExpression {

    boolean value;

    public Constant(boolean val) {
        value = val;
    }

    @Override
    public boolean evaluate(Context context) {
        return value;
    }
}