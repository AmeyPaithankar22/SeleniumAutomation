package RestAssured;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class AuthBasedAPI {

	public static void testAuthentication(String userName, String password, int status) {


		RestAssured.baseURI = "http://postman-echo.com/";
		Response response = RestAssured.given().auth().preemptive().basic(userName, password).get("basic-auth").then().extract().response();
		System.out.println("Status Code " + response.getStatusCode());
		assertEquals(status, response.getStatusCode());

	}
}
