package RestAssured;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class PostAPI {

	public static void testPost1(String reqBody, boolean completeStatus) {
		RestAssured.baseURI = "https://petstore.swagger.io/";
		Response response = RestAssured.given().header("Content-Type","application/json").body(reqBody).post("v2/store/order").then().extract().response();
		System.out.println("Status Code " + response.getStatusCode());
		assertEquals(200, response.getStatusCode());
		ResponseBody resBody = response.getBody();
		JsonPath path = resBody.jsonPath();
		assertEquals(path.getBoolean("complete"), completeStatus);

	}
}
