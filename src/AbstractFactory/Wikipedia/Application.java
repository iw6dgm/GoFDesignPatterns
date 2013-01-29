/*
 * Based on http://it.wikipedia.org/wiki/Abstract_factory
 */
package AbstractFactory.Wikipedia;

/**
 *
 * @author joshua
 */
public class Application {

    public static void main(String[] args) {
        GUIFactory factory = GUIFactory.getFactory();
        Button button = factory.createButton();
        button.paint();
    }
    // Output is either:
    //   "I'm a WinButton:"
    // or:
    //   "I'm an OSXButton:"
}