package RestAssured;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssured1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void validateGenderAPI(String name) {

		RestAssured.baseURI = "https://api.genderize.io/";
		RequestSpecification req = RestAssured.given();
		req.queryParam("name", name);
		Response response = req.get();
		int statusCode = response.getStatusCode();
		System.out.println("Status Code : " + statusCode);
		System.out.println("\n");
		System.out.println("Status Line : " + response.statusLine());
		System.out.println("\n");
		System.out.println("Response Header ----- Content-Type : " + response.getHeader("Content-Type"));
		System.out.println("\n\n\n\n");
		Headers headers = response.getHeaders();
		for(Header h : headers) {
			System.out.println(h.getName() + " : " + h.getValue());
		}
		System.out.println("\n\n\n\n");
		System.out.println("All Headers : " + response.getHeaders());
		System.out.println("\n\n\n\n");
		ResponseBody responseBody = response.getBody();
		JsonPath jsonPath = responseBody.jsonPath();
		System.out.println("Complete Path : " + jsonPath.toString());
		System.out.println("\n\n\n\n");
		System.out.println("Count : " + jsonPath.getInt("count"));
		System.out.println("Gender : " + jsonPath.getString("gender"));
		System.out.println("Name : " + jsonPath.getString("name"));
		System.out.println("Probability : " + jsonPath.getString("probability"));
		
		assertEquals(368, jsonPath.getInt("count"));
		assertEquals("female", jsonPath.getString("gender"));
		assertEquals("Amey", jsonPath.getString("name"));
		assertEquals(0.54, jsonPath.getDouble("probability"), 0);
	}

}
