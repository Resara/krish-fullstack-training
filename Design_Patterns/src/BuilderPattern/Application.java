package BuilderPattern;

public class Application {
    public static void main(String[] args) {
        CarTelascopic1 carTelascopic1 = new CarTelascopic1("full");
        System.out.println(carTelascopic1);

        Car.Builder builder = new Car.Builder("full");

        Car car = builder.dropOffLocation("LA").roadAssistance("Fill").build();
        System.out.println(car);

    }
}
