package SEM;

public class SmartElectricalManager {
    public void handler() {
        System.out.println("\nSEM Handler Started Running ...");

        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);

        bulbPowerSwitch.press();
        //Wait
        for(long i = 1000000000; i > 0; i--);
        bulbPowerSwitch.press();
        System.out.println();

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);

        fanPowerSwitch.press();
        //Wait
        for(long j = 1000000000; j > 0; j--);
        fanPowerSwitch.press();
    }
}
