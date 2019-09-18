package restassured;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import examples.Car;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

public class RestAssuredExercises3Test {

	private static RequestSpecification requestSpec;

	@Rule
	public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

	@BeforeClass
	public static void createRequestSpecification() {

		requestSpec = new RequestSpecBuilder().
			setBaseUri("http://localhost").
			setPort(9876).
			setContentType(ContentType.JSON).
			build();
	}
		
	/*******************************************************
	 * Create a new Car object that represents a blue Ford Focus
	 * POST this object to /cars/postcar
	 * Verify that the response HTTP status code is equal to 200
	 ******************************************************/
	
	@Test
	public void postCarObject_checkResponseHttpStatusCode_expect200() {
		Car car = new Car("Ford","Focus","blue");
		given().
			spec(requestSpec).
				body(car).
		when().post("/car/postcar").
		then().assertThat().statusCode(200);
	}

	/*******************************************************
	 * Perform a GET to /cars/getcar/alfaromeogiulia
	 * Store the response in a Car object
	 * Verify, using that object, that the color is red
	 * Use the standard Assert.assertEquals(expected,actual)
	 * as provided by JUnit for the assertion
	 ******************************************************/

	@Test
	public void getCarObject_checkColor_expectRed() {

		Car myCar =given().
			spec(requestSpec).
		when().get("/car/getcar/alfaromeogiulia").
		as(Car.class);
		Assert.assertEquals("red",myCar.getColor());
	}
}
