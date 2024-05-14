import java.util.Scanner;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Sports extends Student {
    int sGrade;

    public Sports(String name, int rollNumber, int sGrade) {
        super(name, rollNumber);
        this.sGrade = sGrade;
    }
}

class Exam extends Student {
    int eGrade;

    public Exam(String name, int rollNumber, int eGrade) {
        super(name, rollNumber);
        this.eGrade = eGrade;
    }
}

class Results extends Sports {
    int eGrade;
    int sGrade;
    String result;

    public Results(String name, int rollNumber, int eGrade, int sGrade, String result) {
        super(name, rollNumber, sGrade);
        this.eGrade = eGrade;
        this.sGrade = sGrade;
        this.result = result;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Sports Grade: " + sGrade);
        System.out.println("Exam Grade: " + eGrade);
        System.out.println("Result: " + result);
    }
}

public class StudentResultManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.println("\nEnter sports grade:");
        int sGrade = scanner.nextInt();

        System.out.println("\nEnter exam grade:");
        int eGrade = scanner.nextInt();

        scanner.nextLine(); // Consume newline
        System.out.println("\nEnter result:");
        String result = scanner.nextLine();

        Results results = new Results(name, rollNumber, eGrade, sGrade, result);
        results.display();
    }
}
