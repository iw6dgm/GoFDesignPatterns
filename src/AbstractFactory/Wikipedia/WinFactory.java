/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
