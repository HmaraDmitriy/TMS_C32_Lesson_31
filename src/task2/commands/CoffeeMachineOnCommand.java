package task2.commands;

import task2.devices.CoffeeMachine;

public class CoffeeMachineOnCommand implements Command {
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineOnCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.startBrewing();
    }

    @Override
    public void undo() {
        coffeeMachine.stopBrewing();
    }
}