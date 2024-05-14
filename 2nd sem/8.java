class Circle {
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    double getVolume() {
        return getArea() * height;
    }
}

class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3, 5);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle (via Rectangle object): " + circle.getArea());

        System.out.println("Area of Circle (via Cylinder object): " + cylinder.getArea());
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}
