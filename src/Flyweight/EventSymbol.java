/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author joshua
 */
public class EventSymbol {

    private String name;

    public EventSymbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(String owner) {
        System.out.println("Event: " + name + " Owner: " + owner);
    }

    public boolean isEqualsTo(EventSymbol otherEvent) {
        return name.equals(otherEvent.getName());
    }
}
