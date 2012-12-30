/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author joshua
 */
public class MementoExample {

    public static void main(String[] arg) {
        RandomWalker luke = new RandomWalker();
// Creates a Memento that saves the original state
        Memento tripStop = luke.createMemento();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Starting trip...");
            luke.randomWalk();
            whereIs(luke);
            System.out.println("Do you like this place?");
            if (Math.random() < .4) {
                System.out.println("-No!");
// Restores the last saved state
                tripStop.restoreState();
                whereIs(luke);
            } else {
                System.out.println("-Yes!");
// Creates a new Memento to save the new state
                tripStop = luke.createMemento();
            }
        }
        System.out.println("You reach the km " + luke.getCurrentMilestone());
    }

    public static void whereIs(RandomWalker rw) {
        System.out.print("You are now stopped at km "
                + rw.getCurrentMilestone() + ". ");
        System.out.println("This place is " + rw.getLastWalkedDistance()
                + " kms far from your last stop. ");
    }
}
