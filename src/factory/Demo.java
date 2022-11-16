package factory;

public class Demo {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory=new VehicleFactory();
        Vehicle bike= vehicleFactory.getVehicle("BIKE");
        Vehicle car =vehicleFactory.getVehicle("CAR");
        bike.move();
        car.move();
    }
}
