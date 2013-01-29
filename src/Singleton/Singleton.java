package Singleton;

/**
 *
 * @author joshua
 */
public class Singleton {

    /**
     * Creato all'atto di caricamento in memoria della classe, thread-safe
     */
    private final static Singleton ISTANZA = new Singleton();

    /**
     * Costruttore privato, in quanto la creazione dell'istanza deve essere
     * controllata.
     */
    private Singleton() {
    }

    /**
     * Punto di accesso al Singleton.
     *
     * @return il Singleton corrispondente
     */
    public static Singleton getInstance() {
        return ISTANZA;
    }
}
