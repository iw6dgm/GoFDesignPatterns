/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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