package httpTestPkg;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HttpPostRequest {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:3000/employees";
		String requestBody = "{\r\n" + "            \"firstName\":\"Suraj\",\r\n"
				+ "            \"lastname\":\"Gaikwad\",\r\n" + "            \"address\":\"Pune\",\r\n"
				+ "            \"mobileNumber\":9876543210,\r\n" + "            \"gender\":\"Male\"\r\n" + "        }";

		RestAssured.given().body(requestBody).contentType(ContentType.JSON).when().post().then().statusCode(201)
				.body("firstName", equalTo("Suraj")).log().all();
	}

}
