/*
 * Based on http://it.wikipedia.org/wiki/Builder
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