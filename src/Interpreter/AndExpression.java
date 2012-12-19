/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author joshua
 */
public class AndExpression implements BooleanExpression {

    BooleanExpression operand1, operand2;

    public AndExpression(BooleanExpression op1, BooleanExpression op2) {
        operand1 = op1;
        operand2 = op2;
    }

    @Override
    public boolean evaluate(Context context) {
        return operand1.evaluate(context)
                && operand2.evaluate(context);
    }
}