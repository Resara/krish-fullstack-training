package FactoryPattern;

public class BasicPackage extends Package{
    @Override
    protected void createPackage() {
        passengerVehicles.add(new Car());
    }
}
