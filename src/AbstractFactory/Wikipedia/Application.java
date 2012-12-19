/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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