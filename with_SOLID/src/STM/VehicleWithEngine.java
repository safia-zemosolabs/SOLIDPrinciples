package STM;

import STM.VehicleControlInterface;
import STM.VehicleWithEngineInterface;

public class VehicleWithEngine extends TransportDevice implements VehicleControlInterface, VehicleWithEngineInterface {
    double speed;

    public void setSpeed(double speed) { this.speed = speed; }

    public void startEngine() {
        System.out.println("Device Engine started");
    }
}

