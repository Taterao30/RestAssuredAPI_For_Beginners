package TestLayer;
import static io.restassured.RestAssured.*;
public class BearerTokenUse {
	public static void main(String[] args) {
	

	    given()
	            .header("Authorization", "Bearer " + TokenManager.getToken())
	    .when()
	            .get("/users/2")
	    .then()
	            .statusCode(200);
	}
}