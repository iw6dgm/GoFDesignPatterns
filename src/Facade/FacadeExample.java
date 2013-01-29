/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Facade;

/**
 *
 * @author joshua
 */
public class FacadeExample {

    public static void main(String[] arg) {
        ConsoleReader reader = new ConsoleReader(
                ConsoleReader.SECURE_MODE_OFF);
        System.out.println("This is the ’Insecure mode’: "
                + "the system can’t detect invalid inputs.");
        System.out.println("Enter a string : ");
        String text = reader.readString();
        System.out.println("You wrote: " + text);
        System.out.println("Enter an Integer : ");
        Integer oInteger = reader.readInteger();
        System.out.println("You wrote: " + oInteger);
        System.out.println("Enter a Double : ");
        Double oDouble = reader.readDouble();
        System.out.println("You wrote: " + oDouble);
        System.out.println("This is the ’Secure mode’: "
                + "the system raises an exception when it "
                + "detects invalid inputs.");
        reader = new ConsoleReader();
        System.out.println("Enter a string : ");
        text = reader.readString();
        System.out.println("You wrote: " + text);
        System.out.println("Enter an Integer : ");
        oInteger = reader.readInteger();
        System.out.println("You wrote: " + oInteger);
        System.out.println("Enter a Double : ");
        oDouble = reader.readDouble();
        System.out.println("You wrote: " + oDouble);
    }
}
