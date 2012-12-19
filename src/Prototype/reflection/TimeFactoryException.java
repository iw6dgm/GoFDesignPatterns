/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.reflection;

/**
 *
 * @author joshua
 */
public class TimeFactoryException extends Exception {

    public TimeFactoryException(Exception e) {
        super(e.getMessage());
    }
}
