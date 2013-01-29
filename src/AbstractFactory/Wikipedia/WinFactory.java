/*
 * Based on http://it.wikipedia.org/wiki/Abstract_factory
 */
package AbstractFactory.Wikipedia;

/**
 *
 * @author joshua
 */
class WinFactory extends GUIFactory {

    public Button createButton() {
        return new WinButton();
    }
}
