/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.Paranj.Transaction;

import Command.Paranj.Command;
import java.util.Vector;

/**
 *
 * @author joshua
 */
class TransactionCommand implements Command {

    private CommandReceiver commandreceiver;
    private Vector commandnamelist, commandargumentlist;
    private String commandname;
    private CommandArgument commandargument;
    private Command command;

    public TransactionCommand() {
        this(null, null);
    }

    public TransactionCommand(Vector commandnamelist, Vector commandargumentlist) {
        this.commandnamelist = commandnamelist;
        this.commandargumentlist = commandargumentlist;
        commandreceiver = CommandReceiver.getHandle();
    }

    @Override
    public void execute() {
        for (int i = 0; i < commandnamelist.size(); i++) {
            commandname = (String) (commandnamelist.get(i));
            commandargument = (CommandArgument) ((commandargumentlist.get(i)));
            commandreceiver.setCommandArgument(commandargument);
            String classname = commandname + "Command";
            try {
                Class cls = Class.forName(classname);
                command = (Command) cls.newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                System.err.println(e);
            }
            command.execute();
        }
    }
}