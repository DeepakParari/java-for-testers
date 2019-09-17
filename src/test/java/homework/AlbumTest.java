package homework;

import org.junit.Assert;
import org.junit.Test;

public class AlbumTest {

    @Test
    public void toStringTest() {

        // Arrange
        // Instantiate a new album representing Reverence by Faithless, which is their debut album
        Album album = new Album("'Reverence'", "Faithless", true);

        // Act
        // Call the toString() method and store the returned value in a string
        String expectedValue = album.toString();
        // Assert
        // Write an assertion that checks whether the result of the toString method matches
        // "The Faithless album called 'Reverence' is their debut album"
        Assert.assertEquals(expectedValue,"The Faithless album called 'Reverence' is their debut album");
    }

    @Test
    public void anotherToStringTest() {

        // Arrange
        // Instantiate a new album representing Sunday 8PM by Faithless, which is not debut album
        // (it is definitely their best album, but that's not the point here)
        Album album = new Album("'Sunday 8PM'", "Faithless", false);
        // Act
        // Call the toString() method and store the returned value in a string
        String expectedValue = album.toString();
        // Assert
        // Write an assertion that checks whether the result of the toString method matches
        // "The Faithless album called 'Sunday 8PM' is not their debut album"
        Assert.assertEquals(expectedValue,"The Faithless album called 'Sunday 8PM' is not their debut album");
    }
}
