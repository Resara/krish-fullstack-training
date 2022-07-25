package FactoryPattern;

public class PlatinumPackage extends Package{
    @Override
    protected void createPackage() {
        passengerVehicles.add(new Driver());
        passengerVehicles.add(new Car());
    }
}
