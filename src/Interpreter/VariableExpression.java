/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
