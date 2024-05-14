import java.util.Scanner;

abstract class Employee {
    abstract double getAmount();
}

class WeeklyEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public WeeklyEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

     
    double getAmount() {
        return hoursWorked * hourlyRate;
    }
}

class HourlyEmployee extends Employee {
    int weeksWorked;
    double weeklyPay;

    public HourlyEmployee(int weeksWorked, double weeklyPay) {
        this.weeksWorked = weeksWorked;
        this.weeklyPay = weeklyPay;
    }

     
    double getAmount() {
        return weeksWorked * weeklyPay;
    }
}

public class EmployeePaymentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for weekly employee:");
        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        WeeklyEmployee weeklyEmployee = new WeeklyEmployee(hoursWorked, hourlyRate);
        System.out.println("Amount to be paid to weekly employee: " + weeklyEmployee.getAmount());

        System.out.println("\nEnter details for hourly employee:");
        System.out.print("Enter weeks worked: ");
        int weeksWorked = scanner.nextInt();
        System.out.print("Enter weekly pay: ");
        double weeklyPay = scanner.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(weeksWorked, weeklyPay);
        System.out.println("Amount to be paid to hourly employee: " + hourlyEmployee.getAmount());
    }
}
