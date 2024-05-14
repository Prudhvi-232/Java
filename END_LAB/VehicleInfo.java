interface Vehicle {
    String getColor();
    String getNumber();
    double getConsumption();
}

class TwoWheeler implements Vehicle {
    String color;
    String number;
    double consumption;

    public TwoWheeler(String color, String number, double consumption) {
        this.color = color;
        this.number = number;
        this.consumption = consumption;
    }

     
    public String getColor() {
        return color;
    }

     
    public String getNumber() {
        return number;
    }

     
    public double getConsumption() {
        return consumption;
    }
}

class FourWheeler implements Vehicle {
    String color;
    String number;
    double consumption;

    public FourWheeler(String color, String number, double consumption) {
        this.color = color;
        this.number = number;
        this.consumption = consumption;
    }

     
    public String getColor() {
        return color;
    }

     
    public String getNumber() {
        return number;
    }

     
    public double getConsumption() {
        return consumption;
    }
}

public class VehicleInfo {
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler("Black", "TS1234", 50);
        System.out.println("Color of TwoWheeler: " + twoWheeler.getColor());
        System.out.println("Number of TwoWheeler: " + twoWheeler.getNumber());
        System.out.println("Fuel Consumption of TwoWheeler: " + twoWheeler.getConsumption());

        FourWheeler fourWheeler = new FourWheeler("Red", "AP5678", 20);
        System.out.println("\nColor of FourWheeler: " + fourWheeler.getColor());
        System.out.println("Number of FourWheeler: " + fourWheeler.getNumber());
        System.out.println("Fuel Consumption of FourWheeler: " + fourWheeler.getConsumption());
    }
}
