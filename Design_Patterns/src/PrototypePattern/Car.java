package PrototypePattern;

public class Car extends Vehicle {
    private String type;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

