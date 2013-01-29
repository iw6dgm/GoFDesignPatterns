/*
 * Based on http://it.wikipedia.org/wiki/Abstract_factory
 */
package AbstractFactory.Wikipedia;

/**
 *
 * @author joshua
 */
class OSXFactory extends GUIFactory {

    public Button createButton() {
        return new OSXButton();
    }
}
