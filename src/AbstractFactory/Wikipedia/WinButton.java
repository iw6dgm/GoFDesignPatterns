/*
 * Based on http://it.wikipedia.org/wiki/Abstract_factory
 */
package AbstractFactory.Wikipedia;

/**
 *
 * @author joshua
 */
class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("Sono un WinButton: ");
    }
}
