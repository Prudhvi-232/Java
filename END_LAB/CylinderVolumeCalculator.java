import java.util.Scanner;

class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    double getVolume() {
        return super.getArea() * height;
    }
}

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}
