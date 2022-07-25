package FactoryPattern;

public class Application {
    public static void main(String[] args) {
        Package newPack1 = PackageFactory.createPackage(PackageCode.BASIC);
        Package newPack2 = PackageFactory.createPackage(PackageCode.PLATINUM);

        System.out.println(newPack1);
        System.out.println(newPack2);

    }
}
