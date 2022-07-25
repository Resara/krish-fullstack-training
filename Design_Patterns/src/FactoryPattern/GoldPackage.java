package FactoryPattern;

public class GoldPackage extends Package{

    @Override
    protected void createPackage() {
        passengerVehicles.add(new Driver());
        passengerVehicles.add(new Car());
        passengerVehicles.add(new Van());
    }
}
