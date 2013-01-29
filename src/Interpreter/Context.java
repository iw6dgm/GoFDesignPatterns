/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Interpreter;

import java.util.Hashtable;

/**
 *
 * @author joshua
 */
public class Context {

    private Hashtable vars;

    public Context() {
        vars = new Hashtable();
    }

    public void assign(VariableExpression var, boolean value) {
        vars.put(var.getVarName(), value);
    }

    public boolean lookup(String varName) {
        return ((Boolean) vars.get(varName)).booleanValue();
    }
}