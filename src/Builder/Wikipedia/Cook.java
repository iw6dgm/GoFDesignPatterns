/*
 * Based on http://it.wikipedia.org/wiki/Builder
 */
package Builder.Wikipedia;

/**
 *
 * @author joshua
 */
/**
 * "Director"
 */
class Cook {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
