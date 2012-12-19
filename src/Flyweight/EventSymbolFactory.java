/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

import java.util.Hashtable;

/**
 *
 * @author joshua
 */
public class EventSymbolFactory {

    private static Hashtable events = new Hashtable();

    public static EventSymbol newEventSymbol(String evnt) {
        EventSymbol evntRef = (EventSymbol) events.get(evnt);
        if (evntRef == null) {
            evntRef = new EventSymbol(evnt);
            events.put(evnt, evntRef);
        }
        return evntRef;
    }
}
