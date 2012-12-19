/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public class AbstractFactoryExample {

    public static void main(String[] arg) {
        Client client = new Client();
        System.out.println(
                "**Testing tape devices");
        client.selectTechnology(new TapeDevicesFactory());
        client.test("I wanna hold your hand...");
        System.out.println(
                "**Testing CD devices");
        client.selectTechnology(new CDDevicesFactory());
        client.test("Fly me to the moon...");
    }
}
