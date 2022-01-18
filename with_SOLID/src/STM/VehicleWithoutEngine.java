package STM;

public class VehicleWithoutEngine extends TransportDevice
                                  implements VehicleControlInterface, VehicleWithoutEngineInterface {
    double speed;

    public void setSpeed(double speed) { this.speed = speed; }

    public void startMoving() {
        System.out.println("Device started moving");
    }
}