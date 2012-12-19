/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author joshua
 */
public class ProxyExample {

    public static void main(String[] args) {
        FileHandler fh = new ProxyFileHandler("Files/Secret.txt");
        System.out.println("** The name of the file is: ");
        System.out.println(fh.getFileName());
        System.out.println("** The content of the file is: ");
        System.out.println(fh.getContent());
        System.out.println("** The content of the file is (again):");
        System.out.println(fh.getContent());
        System.out.println("** The content of line 2 is: ");
        System.out.println(fh.getLine(2));
        System.out.println("** The content of line 2 is (again): ");
        System.out.println(fh.getLine(2));
        System.out.println("** The content of line 4 is: ");
        System.out.println(fh.getLine(4));
    }
}
