/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Interpreter;

/**
 *
 * @author joshua
 */
public class InterpreterExample {
    public static void main(String[] args) {
        VariableExpression p = new VariableExpression("p");
        VariableExpression q = new VariableExpression("q");
// Expression: "(true AND p) OR ( q AND NOT p )"
        BooleanExpression expr = new OrExpression(
                new AndExpression(new Constant(true), p),
                new AndExpression(q, new NotExpression(p)));
        Context context = new Context();
        context.assign(p, true);
        context.assign(q, true);
        System.out.println("(p=true,q=true) The result is: "
                + expr.evaluate(context));
        context.assign(p, true);
        context.assign(q, false);
        System.out.println("(p=true,q=false) The result is: "
                + expr.evaluate(context));
        context.assign(p, false);
        context.assign(q, true);
        System.out.println("(p=false,q=true) The result is: "
                + expr.evaluate(context));
        context.assign(p, false);
        context.assign(q, false);
        System.out.println("(p=false,q=false) The result is: "
                + expr.evaluate(context));
    }
}
