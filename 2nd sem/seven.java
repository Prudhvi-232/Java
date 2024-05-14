class Rectangle {
    protected double length;
    protected double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    private double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }
}

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class seven {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);
        Box box = new Box(3, 4, 5);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Volume of Box: " + box.getVolume());
    }
}
