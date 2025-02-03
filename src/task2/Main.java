package task2;

import task2.commands.*;
import task2.devices.AirConditioner;
import task2.devices.CoffeeMachine;
import task2.devices.FloorHeater;
import task2.devices.Light;


/*2. Необходимо разработать программу, которая использует паттерн проектирования "Команда"
для управления некоторыми действиями в системе "Умный дом".
В качестве примера можно рассмотреть управление устройствами такими как свет,
вентиляторы или другие бытовые приборы.*/

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        AirConditioner ac = new AirConditioner();
        FloorHeater heater = new FloorHeater();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Command lightOn = new LightOnCommand(light);
        Command acOn = new ACOnCommand(ac);
        Command heaterOn = new FloorHeaterOnCommand(heater);
        Command coffeeOn = new CoffeeMachineOnCommand(coffeeMachine);

        System.out.println("Managing a smart home");

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(acOn);
        remote.pressButton();

        remote.setCommand(heaterOn);
        remote.pressButton();

        remote.setCommand(coffeeOn);
        remote.pressButton();

        System.out.println("\nUndo last command");
        remote.pressUndo();

        remote.pressUndo();
    }
}