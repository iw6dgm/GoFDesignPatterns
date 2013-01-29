/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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