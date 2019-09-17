package homework;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DataDrivenAlbumTest {

    // Refactor the test code from the previous exercise into a data driven test
    // Create a DataProvider method that returns a two-dimensional array containing the values required
    // for the tests in the previous exercise
    private Album album;

    @DataProvider
    public static Object[][] albumDataProvider(){
        return new Object[][]{
                {"'Reverence'", "Faithless", true, "The Faithless album called 'Reverence' is their debut album"},
                { "'Sunday 8PM'", "Faithless", false,"The Faithless album called 'Sunday 8PM' is not their debut album"}

        };
    }
    @UseDataProvider("albumDataProvider")
    @Test
    public void dataDrivenAlbumStringReturnCheck(String title, String artist, boolean debutAlbum, String expectedResult){

        album = new Album(title,artist,debutAlbum);
        Assert.assertEquals(expectedResult,album.toString());
    }

    // Create a data driven test that uses the values from the test data object returned by the data provider
    // to execute the test logic defined in the test method twice, once for each test data record
}
