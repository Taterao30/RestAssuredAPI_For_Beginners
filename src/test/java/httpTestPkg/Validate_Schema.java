package httpTestPkg;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Validate_Schema {

	public static void main(String[] args) {

		// Base URI
		RestAssured.baseURI = "http://localhost:3000/employees";

		// Request Payload
		String requestBody = """
				{
				    "firstName":"Suraj",
				    "lastname":"Gaikwad",
				    "address":"Pune",
				    "mobileNumber":9876543210,
				    "gender":"Male"
				}
				""";

		// POST Request + Schema Validation
		given().contentType(ContentType.JSON).body(requestBody)

				.when().post()

				.then().statusCode(201).contentType(ContentType.JSON)
				.body(matchesJsonSchemaInClasspath("schema/employeeSchema.json")).log().all();
	}
	/*
	 * 1. $schema 2. type 3. required 4. properties 5. type
	 */

}