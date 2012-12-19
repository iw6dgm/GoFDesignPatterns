/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author joshua
 */
public class NotExpression implements BooleanExpression {

    BooleanExpression operand;

    public NotExpression(BooleanExpression op) {
        operand = op;
    }

    @Override
    public boolean evaluate(Context context) {
        return !operand.evaluate(context);
    }
}