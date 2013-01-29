/*
 * Based on http://it.wikipedia.org/wiki/Builder
 */
package Builder.Wikipedia;

/**
 *
 * @author joshua
 */
/**
 * "ConcreteBuilder"
 */
class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
