/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj;

/**
 *
 * @author joshua
 */
class Switch {

    private Command UpCommand, DownCommand;

    public Switch(Command Up, Command Down) {
        UpCommand = Up; // concrete Command registers itself with the invoker 
        DownCommand = Down;
    }

    void flipUp() { // invoker calls back concrete Command, which executes the Command on the receiver 
        UpCommand.execute();
    }

    void flipDown() {
        DownCommand.execute();
    }
}
