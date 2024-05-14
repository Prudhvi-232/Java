import java.util.Scanner;

interface StudentFee {
    double getAmount();

    String getFirstName();

    String getLastName();

    String getAddress();

    String getContact();
}

class Hostler implements StudentFee {
    double fee;
    String firstName;
    String lastName;
    String address;
    String contact;

    public Hostler(double fee, String firstName, String lastName, String address, String contact) {
        this.fee = fee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

     
    public double getAmount() {
        return fee;
    }

     
    public String getFirstName() {
        return firstName;
    }

     
    public String getLastName() {
        return lastName;
    }

     
    public String getAddress() {
        return address;
    }

     
    public String getContact() {
        return contact;
    }
}

class NonHostler implements StudentFee {
    double fee;
    String firstName;
    String lastName;
    String address;
    String contact;

    public NonHostler(double fee, String firstName, String lastName, String address, String contact) {
        this.fee = fee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

     
    public double getAmount() {
        return fee;
    }

     
    public String getFirstName() {
        return firstName;
    }

     
    public String getLastName() {
        return lastName;
    }

     
    public String getAddress() {
        return address;
    }

     
    public String getContact() {
        return contact;
    }
}

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Hostler:");
        System.out.print("Enter fee: ");
        double fee = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter contact: ");
        String contact = scanner.nextLine();

        Hostler hostler = new Hostler(fee, firstName, lastName, address, contact);
        System.out.println("Amount to be paid by Hostler: " + hostler.getAmount());

        System.out.println("\nEnter details for Non-Hostler:");
        System.out.print("Enter fee: ");
        fee = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        System.out.print("Enter contact: ");
        contact = scanner.nextLine();

        NonHostler nonHostler = new NonHostler(fee, firstName, lastName, address, contact);
        System.out.println("Amount to be paid by Non-Hostler: " + nonHostler.getAmount());
    }
}
