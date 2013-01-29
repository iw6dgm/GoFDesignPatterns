/*
 * Based on Effective Java 2
 */
package Builder.EffectiveJava2;

/**
 *
 * @author joshua
 */
public class Example {
    NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
            calories(100).sodium(35).carbohydrate(27).build();
}
