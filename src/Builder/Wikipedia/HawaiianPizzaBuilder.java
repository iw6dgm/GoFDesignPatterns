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
class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
