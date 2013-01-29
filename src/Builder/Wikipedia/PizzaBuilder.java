/*
 * Based on http://it.wikipedia.org/wiki/Builder
 */
package Builder.Wikipedia;

/**
 *
 * @author joshua
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();   
}
