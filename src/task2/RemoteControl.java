package task2;

import task2.commands.Command;

import java.util.Stack;

public class RemoteControl {
    private Command lastCommand;
    private Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.lastCommand = command;
    }

    public void pressButton() {
        if (lastCommand != null) {
            lastCommand.execute();
            history.push(lastCommand);
        }
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.undo();
        } else {
            System.out.println("No commands to cancel");
        }
    }
}