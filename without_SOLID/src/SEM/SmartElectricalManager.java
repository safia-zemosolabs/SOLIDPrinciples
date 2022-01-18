package SEM;

public class SmartElectricalManager {
    public void handler() {
        System.out.println("\nSEM Handler Started Running ...");

        LightBulb wiproBulb = new LightBulb();
        ElectricPowerSwitch powerSwitch = new ElectricPowerSwitch(wiproBulb);

        powerSwitch.press();
        //Wait
        for(long i = 1000000000; i > 0; i--);
        powerSwitch.press();
    }
}
