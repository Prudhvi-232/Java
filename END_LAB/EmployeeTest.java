import java.util.Scanner;

class Employee {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class ContractEmployee extends Employee {
    String department;
    String designation;

    public ContractEmployee(String firstName, String lastName, String department, String designation) {
        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
    }

    public void displayFullName() {
        System.out.println("Full Name: " + getFirstName() + " " + getLastName());
    }

    public String getDepartment() {
        return department;
    }

    public String getDesig() {
        return designation;
    }
}

class RegularEmployee extends Employee {
    String department;
    String designation;

    public RegularEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void displayFullName() {
        System.out.println("Full Name: " + getFirstName() + " " + getLastName());
    }

    public String getDepartment() {
        return department;
    }

    public String getDesig() {
        return designation;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Contract Employee details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Designation: ");
        String designation = scanner.nextLine();

        ContractEmployee contractEmp = new ContractEmployee(firstName, lastName, department, designation);
        contractEmp.displayFullName();
        System.out.println("Department: " + contractEmp.getDepartment());
        System.out.println("Designation: " + contractEmp.getDesig());

        System.out.println("\nEnter Regular Employee details:");
        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        lastName = scanner.nextLine();

        RegularEmployee regularEmp = new RegularEmployee(firstName, lastName);
        regularEmp.displayFullName();
    }
}
