import java.util.Scanner;

abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

     
    double getArea() {
        return side * side;
    }

     
    double getVolume() {
        return 0; // A square is a 2D shape, so volume is 0
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

     
    double getArea() {
        return Math.PI * radius * radius;
    }

     
    double getVolume() {
        return 0;
    }
}

class Cube extends Shape {
    double side;

    public Cube(double side) {
        this.side = side;
    }

     
    double getArea() {
        return 6 * side * side;
    }

     
    double getVolume() {
        return side * side * side;
    }
}

class Sphere extends Shape {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

     
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

     
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the square:");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
        System.out.println("Area of Square: " + square.getArea());

        System.out.println("\nEnter the radius of the circle:");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Area of Circle: " + circle.getArea());

        System.out.println("\nEnter the side of the cube:");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Surface Area of Cube: " + cube.getArea());
        System.out.println("Volume of Cube: " + cube.getVolume());

        System.out.println("\nEnter the radius of the sphere:");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Surface Area of Sphere: " + sphere.getArea());
        System.out.println("Volume of Sphere: " + sphere.getVolume());
    }
}
