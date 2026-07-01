package httpTestPkg;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://localhost:3001/users";

		RequestSpecification httpRequ = RestAssured.given();
		httpRequ.when().get().then().statusCode(200).body("[0].id", equalTo("101"))
				.body("[0].email", equalTo("taterao@example.com")).body("[0].profile.age", equalTo(30))
				.body("[0].profile.preferences.newsletter ", equalTo(false))
				.body("[0].profile.preferences.languages[0]", equalTo("English"))
				.body("[0].profile.preferences.sports[1].cricket", equalTo(false))
				.body("[0].profile.preferences.city[0].Mumbai.selected", equalTo(true))
				.body("[0].profile.preferences.city[1].Pune", equalTo(false)).log().all();

		//

	}

	/**
	 * [ { "id": "101", "name": "Taterao Gaikwad", "email": "taterao@example.com",
	 * "profile": { "age": 30, "gender": "male", "preferences": { "notifications":
	 * true, "newsletter": false, "languages": [ "English", "Hindi" ], "sports": [ {
	 * "football": true }, { "cricket": false }, { "tennis": true } ], "city": [ {
	 * "Mumbai": { "selected": true, "areas": [ "CST", "Thane", "Kalyan" ] } }, {
	 * "Pune": false }, { "Banglore": true } ] } } } ]
	 */

}
