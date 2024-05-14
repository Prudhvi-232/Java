class ContractEmployee {
    String firstName;
    String lastName;
    String department;
    
    ContractEmployee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    
    void getDesig() {
        System.out.println("Contract Employee");
    }
}

class HourlyEmployee extends ContractEmployee {
    int hours;
    double wagePerHour;
    
    HourlyEmployee(String firstName, String lastName, String department, int hours, double wagePerHour) {
        super(firstName, lastName, department);
        this.hours = hours;
        this.wagePerHour = wagePerHour;
    }
    
    @Override
    void getDesig() {
        System.out.println("Hourly Employee");
    }
    
    double calculateWages() {
        return hours * wagePerHour * 30; // Assuming 30 days in a month
    }
}

class WeeklyEmployee extends ContractEmployee {
    int weeks;
    double wagePerWeek;
    
    WeeklyEmployee(String firstName, String lastName, String department, int weeks, double wagePerWeek) {
        super(firstName, lastName, department);
        this.weeks = weeks;
        this.wagePerWeek = wagePerWeek;
    }
    
    @Override
    void getDesig() {
        System.out.println("Weekly Employee");
    }
    
    double calculateWages() {
        return weeks * wagePerWeek;
    }
}

public class ContractEmployeeSubclasses {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmp = new HourlyEmployee("John", "Doe", "IT", 160, 15.5);
        WeeklyEmployee weeklyEmp = new WeeklyEmployee("Jane", "Smith", "HR", 4, 500);
        
        hourlyEmp.getDesig();
        System.out.println("Monthly wages of Hourly Employee: $" + hourlyEmp.calculateWages());
        
        weeklyEmp.getDesig();
        System.out.println("Monthly wages of Weekly Employee: $" + weeklyEmp.calculateWages());
    }
}
