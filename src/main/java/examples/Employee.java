package examples;

public class Employee extends Person {

    private int monthlySalary;
    
    public Employee() {
        this.monthlySalary = 3000;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String toString() {
        return String.format("%s is %d years old and earns %d per month", this.getName(), this.getAge(), this.getMonthlySalary());
    }
}
