/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author joshua
 */
public class ConnectorHandler extends ElementHandler {

    @Override
    public MapElement newElement() {
        return new Connector();
    }

    public void connect(Connector conn, Place origin, Place destination) {
        conn.setPlacesConnected(origin, destination);
    }
}
