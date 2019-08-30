package examples;

public class RegularEmployee extends EmployeeTemplate {

    public int calculateSalary() {
        return this.getHourlyWage() * this.getHoursPerWeek();
    }
}
