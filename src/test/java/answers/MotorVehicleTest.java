package answers;

import org.junit.Assert;
import org.junit.Test;

public class MotorVehicleTest {

    @Test
    public void toStringTest() {

        // Arrange
        MotorVehicle motorVehicle = new MotorVehicle();

        // Act
        motorVehicle.setNumberOfWheels(4);

        // Assert
        Assert.assertEquals("This motor vehicle has 4 wheels and 4 doors", motorVehicle.toString());
    }
}
