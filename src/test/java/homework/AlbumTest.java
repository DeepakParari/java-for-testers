package homework;

import homeworkanswers.Album;
import org.junit.Assert;
import org.junit.Test;

public class AlbumTest {

    @Test
    public void toStringTest() {

        // Arrange
        // Instantiate a new album representing Reverence by Faithless, which is their debut album

        // Act
        // Call the toString() method and store the returned value in a string

        // Assert
        // Write an assertion that checks whether the result of the toString method matches
        // "The Faithless album called 'Reverence' is their debut album"
    }

    @Test
    public void anotherToStringTest() {

        // Arrange
        // Instantiate a new album representing Sunday 8PM by Faithless, which is not debut album
        // (it is definitely their best album, but that's not the point here)

        // Act
        // Call the toString() method and store the returned value in a string

        // Assert
        // Write an assertion that checks whether the result of the toString method matches
        // "The Faithless album called 'Sunday 8PM' is not their debut album"
    }
}
