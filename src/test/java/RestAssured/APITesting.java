package RestAssured;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class APITesting {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void genderizeAPI() {
		RestAssured1.validateGenderAPI("Amey");
	}

	//@Test
	void countryAPI() {
		UniversityAPI.testUniversityAPI("India");
		UniversityAPI.testUniversityAPI("");
	}

	@Test
	void stateCount() {
		UniversityAPI.testUniversityAPI_State("India", "Kanpur University");
	}

	@Test
	void validateAuthAPI() {
		AuthBasedAPI.testAuthentication("postman", "password", 200);
		AuthBasedAPI.testAuthentication("postman", "password1", 401);
	}

	@Test
	void validatePostAPI() {
		String reqBody1= "{\"id\": 0,\"petId\": 0,\"quantity\": 0,\"shipDate\": \"2023-10-19T04:21:55.067Z\",\"status\": \"placed\",\"complete\": true}";
		PostAPI.testPost1(reqBody1, true);
	}

}
