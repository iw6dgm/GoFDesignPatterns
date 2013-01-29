/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Interpreter;

/**
 *
 * @author joshua
 */
public interface BooleanExpression {
    public boolean evaluate(Context context);
}
