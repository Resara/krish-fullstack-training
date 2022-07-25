package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class Registory {

    private Map<VehicleType, Vehicle> vehicles = new HashMap<>();

    public Registory(){
        this.initialized();
    }

    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        try {
            vehicle =(Vehicle) vehicles.get(vehicleType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return vehicle;
    }
    private void initialized() {

        Car car = new Car();
        car.setEngineCapacity(2000);
        car.setType("Mini");
        car.setFuelType("Gasoline");

        Bus bus = new Bus();
        bus.setNumberOfSeats(32);
        bus.setEngineCapacity(3000);
        bus.setFuelType("Disel");

        //vehicles.put(VehicleType.CAR, car);

    }

}
