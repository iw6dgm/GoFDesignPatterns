/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
