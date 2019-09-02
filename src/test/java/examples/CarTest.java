package examples;

import org.junit.*;

public class CarTest {

    @Test
    public void isItalianPositiveTest() {

        // Arrange - Create a new instance of the Car class with prespecified property values
        Car myCar = new Car("Maserati","Ghibli","blue");

        // Act - Invoke the method to be tested
        boolean isItalian = myCar.isItalian();

        // Assert - Check that the result of the method invocation matches the expected result
        Assert.assertTrue(isItalian);
    }
}
