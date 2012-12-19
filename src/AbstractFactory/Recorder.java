/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author joshua
 */
public interface Recorder {
    public void accept(Media med);

    public void record(String sound);

}
