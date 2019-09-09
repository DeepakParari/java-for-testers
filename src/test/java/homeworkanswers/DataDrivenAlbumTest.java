package homeworkanswers;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DataDrivenAlbumTest {

    private Album album;

    @DataProvider
    public static Object[][] albumTestData() {
        return new Object[][] {
            {"Reverence", "Faithless", true, "The Faithless album called 'Reverence' is their debut album"},
            {"Sunday 8PM", "Faithless", false, "The Faithless album called 'Sunday 8PM' is not their debut album"}
        };
    }

    @Test
    @UseDataProvider("albumTestData")
    public void dataDrivenToStringTest(String title, String artist, boolean isDebutAlbum, String expectedToStringResult) {

        // Arrange
        album = new Album(title, artist, isDebutAlbum);

        // Act
        String albumInfo = album.toString();

        // Assert
        Assert.assertEquals(
            expectedToStringResult,
            album.toString()
        );
    }
}
