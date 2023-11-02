package RestAssured;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class UniversityAPI {

	public static void testUniversityAPI(String countryName) {

		int count = 0;
		RestAssured.baseURI = "http://universities.hipolabs.com/";
		Response response = RestAssured.given().queryParam("country", countryName).get("search").then().extract().response();
		System.out.println("Status Code " + response.getStatusCode());
		assertEquals(200, response.getStatusCode());

		ResponseBody resBody = response.getBody();
		JsonPath jsonPath = resBody.jsonPath();
		List<String> listState = jsonPath.getList("state-province");
		System.out.println(listState);
		for(int i = 0; i < listState.size(); i++) {
			for(int j=i+1; j < listState.size(); j++) {
				if(listState.get(j)!=null && !listState.get(j).equals("ignore")) {
					if(listState.get(i).equals(listState.get(j))) {
						count++;
						listState.add(j, "ignore");
					}
				}
			}
			System.out.println(listState.get(i) + " : " + count);
			count=0;
		}
	}

	public static void testUniversityAPI_State(String countryName, String uniName) {


		RestAssured.baseURI = "http://universities.hipolabs.com/";
		Response response = RestAssured.given().queryParam("country", countryName).get("search").then().extract().response();
		System.out.println("Status Code " + response.getStatusCode());
		assertEquals(200, response.getStatusCode());

		ResponseBody resBody = response.getBody();
		JsonPath jsonPath = resBody.jsonPath();
		List<String> listState = jsonPath.getList("name");
		System.out.println(listState);
		if(listState.contains(uniName)) {
			System.out.println("Exists");
		}
		else
			System.out.println("Does not Exist");
	}
}
