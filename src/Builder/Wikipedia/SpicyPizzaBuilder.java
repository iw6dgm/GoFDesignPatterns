/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
