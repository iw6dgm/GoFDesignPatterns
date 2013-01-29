/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
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
