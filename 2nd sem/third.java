import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculateCircumference();
}
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the cicle");
        double radius = sc.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("area of the circle: " + circle.calculateArea());
        System.out.println("circumference of the circle: " + circle.calculateCircumference());
    }
}
