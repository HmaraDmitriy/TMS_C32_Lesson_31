package task2.commands;

import task2.devices.FloorHeater;

public class FloorHeaterOnCommand implements Command {
    private FloorHeater heater;

    public FloorHeaterOnCommand(FloorHeater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.turnOn();
    }

    @Override
    public void undo() {
        heater.turnOff();
    }
}
