package task2.commands;

import task2.devices.AirConditioner;

public class ACOnCommand implements Command {
    private AirConditioner ac;

    public ACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
