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
