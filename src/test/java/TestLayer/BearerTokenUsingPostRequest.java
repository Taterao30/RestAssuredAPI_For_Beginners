package TestLayer;
import static io.restassured.RestAssured.*;
public class BearerTokenUsingPostRequest {
	
	public static void main(String[] args) {


		    String payload = "{\r\n"
		    		+ "		                \"name\":\"Taterao\",\r\n"
		    		+ "		                \"job\":\"QA Engineer\"\r\n"
		    		+ "		            }";
		            

		    given()
		            .header("Authorization", "Bearer " + TokenManager.getToken())
		            .contentType("application/json")
		            .body(payload)
		    .when()
		            .post("/users")
		    .then()
		            .statusCode(201);
		}
	
}
