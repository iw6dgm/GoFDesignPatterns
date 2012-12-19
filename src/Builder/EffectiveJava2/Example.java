/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
