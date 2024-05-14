class Example {
    int number;

    Example(int number) {
        this.number = number; // 'this' keyword to differentiate between instance variable and parameter
    }

    void display() {
        System.out.println("Number: " + this.number); // Using 'this' keyword to access instance variable
    }
}

class SuperClass {
    SuperClass() {
        System.out.println("Constructor of SuperClass");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super(); // Calling super class constructor
        System.out.println("Constructor of SubClass");
    }
}

class StaticExample {
    static int count = 0;

    StaticExample() {
        count++; // Incrementing static variable
    }

    static void displayCount() {
        System.out.println("Count: " + count); // Accessing static variable
    }
}

public class JavaKeywordsExamples {
    public static void main(String[] args) {
        // Example for 'this' keyword
        Example obj1 = new Example(10);
        obj1.display();

        // Example for 'super' keyword
        SubClass obj2 = new SubClass();

        // Example for static variables and methods
        StaticExample obj3 = new StaticExample();
        StaticExample obj4 = new StaticExample();
        StaticExample obj5 = new StaticExample();
        StaticExample.displayCount();
    }
}
