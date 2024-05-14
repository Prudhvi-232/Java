class SuperClass {
    String message = "Hello from SuperClass";

    void display() {
        System.out.println(message);
    }
}

class SubClass extends SuperClass {
    String message = "Hello from SubClass";

    void display() {
        super.display(); // Accessing super class method
        System.out.println(message);
    }
}

public class SuperClassAccess {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
