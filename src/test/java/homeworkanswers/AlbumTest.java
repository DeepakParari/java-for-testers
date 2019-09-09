package homeworkanswers;

import org.junit.Assert;
import org.junit.Test;

public class AlbumTest {

    @Test
    public void toStringTest() {

        // Arrange
        Album album = new Album("Reverence", "Faithless", true);

        // Act
        String albumInfo = album.toString();

        // Assert
        Assert.assertEquals(
            "The Faithless album called 'Reverence' is their debut album",
            album.toString()
        );
    }

    @Test
    public void anotherToStringTest() {

        // Arrange
        Album album = new Album("Sunday 8PM", "Faithless", false);

        // Act
        String albumInfo = album.toString();

        // Assert
        Assert.assertEquals(
            "The Faithless album called 'Sunday 8PM' is not their debut album",
            album.toString()
        );
    }
}
