package FactoryPattern;

public class SilverPackage extends Package{
    @Override
    protected void createPackage() {
        passengerVehicles.add(new Driver());
        passengerVehicles.add(new Van());
    }
}
