package Class17;

public class LapTop {

    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public LapTop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;

    }
    public LapTop(String make, String model, double batteryLife, int storage, boolean camera) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;


    }

    public static void main(String[] args) {
        LapTop dellG5=new LapTop("Dell","G5",3,512,true);




    }
}
