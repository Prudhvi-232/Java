abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
}

class Square extends Shape {
    private double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    double getArea() {
        return side * side;
    }
    @Override
    double getVolume() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double getVolume() {
        return 0;
    }
}

class Cube extends Shape {
    private double side;
    Cube(double side) {
        this.side = side;
    }
    @Override
    double getArea() {
        return 6 * side * side;
    }
    @Override
    double getVolume() {
        return side * side * side;
    }
}

class Sphere extends Shape {
    private double radius;
    Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    @Override
    double getVolume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }
}

public class fifth  {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Cube cube = new Cube(4);
        Sphere sphere = new Sphere(6);

        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Volume of Square: " + square.getVolume());

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Volume of Circle: " + circle.getVolume());

        System.out.println("Area of Cube: " + cube.getArea());
        System.out.println("Volume of Cube: " + cube.getVolume());

        System.out.println("Area of Sphere: " + sphere.getArea());
        System.out.println("Volume of Sphere: " + sphere.getVolume());
    }
}
