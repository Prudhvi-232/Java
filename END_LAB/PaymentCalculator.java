interface Payable {
    double getAmount();
}

class Invoice implements Payable {
    double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}

class Employee implements Payable {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getAmount() {
        return salary;
    }
}

public class PaymentCalculator {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        System.out.println("Amount to be paid for Invoice: " + invoice.getAmount());

        Employee employee = new Employee(2000);
        System.out.println("Amount to be paid for Employee: " + employee.getAmount());
    }
}
