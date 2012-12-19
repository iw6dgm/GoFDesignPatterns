/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Wikipedia;

/**
 *
 * @author joshua
 */
/*
 * GUIFactory example
 */
abstract class GUIFactory {

    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

    private static int readFromConfigFile(String oS_TYPE) {
        return 0;
    }

    public abstract Button createButton();
}
