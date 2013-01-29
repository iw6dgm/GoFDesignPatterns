/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Interpreter;

/**
 *
 * @author joshua
 */
class VariableExpression implements BooleanExpression {
    private String varName;

    public VariableExpression(String name) {
        varName = name;
    }

    @Override
    public boolean evaluate(Context context) {
        return context.lookup(varName);
    }

    public String getVarName() {
        return varName;
    } 
}
