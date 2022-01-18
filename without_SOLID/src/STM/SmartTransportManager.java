package STM;

public class SmartTransportManager {
    public void handler() {
        System.out.println("\nSTM Handler Started Running ...");

        Bus busObj = new Bus();
        Bicycle bicycleObj = new Bicycle();

        busObj.startEngine();
        bicycleObj.startEngine();
    }
}
