interface Vehicle {
    String getColor();
    String getNumber();
    double getConsumption();
    double calculateFuelConsumed(double distance);
}

class TwoWheeler implements Vehicle {
    private String color;
    private String number;
    private double consumption;

    TwoWheeler(String color, String number, double consumption) {
        this.color = color;
        this.number = number;
        this.consumption = consumption;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return consumption;
    }

    @Override
    public double calculateFuelConsumed(double distance) {
        return (distance / 100) * consumption;
    }
}

class FourWheeler implements Vehicle {
    private String color;
    private String number;
    private double consumption;

    FourWheeler(String color, String number, double consumption) {
        this.color = color;
        this.number = number;
        this.consumption = consumption;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return consumption;
    }

    @Override
    public double calculateFuelConsumed(double distance) {
        return (distance / 100) * consumption;
    }
}

public class Main {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler("Red", "1234", 3.5);
        FourWheeler car = new FourWheeler("Blue", "5678", 8.2);

        double distance = 100; // Assuming a distance of 100 km

        System.out.println("Details of TwoWheeler:");
        System.out.println("Color: " + bike.getColor());
        System.out.println("Number: " + bike.getNumber());
        System.out.println("Fuel Consumption: " + bike.getConsumption() + " km/l");
        System.out.println("Fuel Consumed for " + distance + " km: " + bike.calculateFuelConsumed(distance) + " liters");

        System.out.println("\nDetails of FourWheeler:");
        System.out.println("Color: " + car.getColor());
        System.out.println("Number: " + car.getNumber());
        System.out.println("Fuel Consumption: " + car.getConsumption() + " km/l");
        System.out.println("Fuel Consumed for " + distance + " km: " + car.calculateFuelConsumed(distance) + " liters");
    }
}
