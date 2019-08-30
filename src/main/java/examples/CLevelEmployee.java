package examples;

public class CLevelEmployee extends EmployeeTemplate {

    public int calculateSalary() {
        return this.getHourlyWage() * this.getHoursPerWeek() + 2500;
    }
}
