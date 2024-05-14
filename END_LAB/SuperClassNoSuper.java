class SuperClass {
    String message = "Hello from SuperClass";

    void display() {
        System.out.println(message);
    }
}

class SubClass extends SuperClass {
    String message = "Hello from SubClass";

    void display() {
        // Accessing super class method without super keyword
        System.out.println(super.message);
        System.out.println(message);
    }
}

public class SuperClassNoSuper {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
