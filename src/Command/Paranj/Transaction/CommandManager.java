/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj.Transaction;

import Command.Paranj.Command;

/**
 *
 * @author joshua
 */
class CommandManager {

    private Command myCommand;

    public CommandManager(Command myCommand) {
        this.myCommand = myCommand;
    }

    public void runCommands() {
        myCommand.execute();
    }
}
