interface Fare {
    double getAmount();
}

class Bus implements Fare {
    double fare;

    public Bus(double fare) {
        this.fare = fare;
    }

     
    public double getAmount() {
        return fare;
    }
}

class Train implements Fare {
    double fare;

    public Train(double fare) {
        this.fare = fare;
    }

     
    public double getAmount() {
        return fare;
    }
}

public class FareCalculator {
    public static void main(String[] args) {
        Bus bus = new Bus(50);
        System.out.println("Fare for Bus: " + bus.getAmount());

        Train train = new Train(100);
        System.out.println("Fare for Train: " + train.getAmount());
    }
}
