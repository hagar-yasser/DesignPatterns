package factory;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType){
        switch (vehicleType){
            case "BIKE":
                return new Bike();
            case "CAR":
                return new Car();
        }
        //unsupported vehicleType
        return null;
    }
}
