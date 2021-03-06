package wiremock.answers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;

import org.junit.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

public class WireMockAnswers1Test {
	
	WireMockAnswers1 wma = new WireMockAnswers1();
	
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(9876);
	
	@Test
	public void testExercise101() {
        
	    wma.setupStubExercise101();
	         
	    given().
	    when().
	        get("http://localhost:9876/exercise101").
	    then().
	        assertThat().
	        statusCode(200);
	}
	
	@Test
	public void testExercise102() {
        
	    wma.setupStubExercise102();
	         
	    given().
	    when().
	        get("http://localhost:9876/exercise102").
	    then().
	        assertThat().
	        contentType(ContentType.TEXT);
	}
	
	@Test
	public void testExercise103() {
        
	    wma.setupStubExercise103();
	         
	    given().
	    when().
	        get("http://localhost:9876/exercise103").
	    then().
	        assertThat().
	        body(equalTo("Exercise 103"));
	}

}
