/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author joshua
 */
public class ConsoleReaderException extends RuntimeException {

    public ConsoleReaderException(Exception e) {
        super(e.toString());
    }
}
