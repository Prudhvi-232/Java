import java.util.Scanner;

class Box extends Rectangle {
    double height;

    public Box(double radius, double length, double height) {
        super(radius, length);
        this.height = height;
    }

    double getVolume() {
        return length * radius * height;
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the height of the box:");
        double height = scanner.nextDouble();

        Box box = new Box(radius, length, height);
        System.out.println("Volume of Box: " + box.getVolume());
    }
}
