import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Circle {
    double length;

    public Rectangle(double radius, double length) {
        super(radius);
        this.length = length;
    }

     
    double getArea() {
        return length * radius;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.getArea());

        System.out.println("\nEnter the length of the rectangle:");
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(radius, length);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
