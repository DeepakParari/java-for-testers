package examples;

public abstract class EmployeeTemplate {

    private int hourlyWage;
    private int hoursPerWeek;

    public abstract int calculateSalary();

    int getHourlyWage() { return this.hourlyWage; }

    int getHoursPerWeek() { return this.hoursPerWeek; }
}
