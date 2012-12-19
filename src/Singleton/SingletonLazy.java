/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author joshua
 */
public class SingletonLazy {

    /**
     * Costruttore privato, in quanto la creazione dell'istanza deve essere
     * controllata.
     */
    private SingletonLazy() {
    }

    /**
     * La classe Contenitore viene caricata/inizializzata alla prima esecuzione
     * di getInstance() ovvero al primo accesso a Contenitore.ISTANZA, ed in
     * modo thread-safe. Anche l'inizializzazione dell'attributo statico,
     * pertanto, viene serializzata.
     */
    private static class Contenitore {

        private final static SingletonLazy ISTANZA = new SingletonLazy();
    }

    /**
     * Punto di accesso al Singleton. Ne assicura la creazione thread-safe solo
     * all'atto della prima chiamata.
     *
     * @return il Singleton corrispondente
     */
    public static SingletonLazy getInstance() {
        return Contenitore.ISTANZA;
    }
}
