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
 * A given type of pizza being constructed.
 */
class BuilderExample {

    public static void main(String[] args) {
        Cook cook = new Cook();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        cook.setPizzaBuilder(hawaiianPizzaBuilder);
        cook.constructPizza();

        Pizza pizza = cook.getPizza();
    }
}