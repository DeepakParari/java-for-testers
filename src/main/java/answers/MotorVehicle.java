package answers;

public class MotorVehicle extends Vehicle {

    private int numberOfDoors;

    public MotorVehicle() {
        this.numberOfDoors = 4;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String toString() {
        return String.format("This motor vehicle has %d wheels and %d doors", this.getNumberOfWheels(), this.getNumberOfDoors());
    }
}
