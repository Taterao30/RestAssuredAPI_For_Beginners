package TestLayer;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

public class CreateAndGetEmployeeTest {

    public static void main(String[] args) {

        // Request Body
        String requestBody = " {\r\n"
        		+ "                    \"firstName\": \"Rahul\",\r\n"
        		+ "                    \"lastname\": \"Sharma\",\r\n"
        		+ "                    \"address\": \"Delhi\",\r\n"
        		+ "                    \"mobileNumber\": 98765432,\r\n"
        		+ "                    \"gender\": \"male\"\r\n"
        		+ "                }";
        // POST Request
        Response postResponse =
                given()
                    .contentType("application/json")
                    .body(requestBody)

                .when()
                    .post("http://localhost:3000/employees")

                .then()
                    .statusCode(201)
                    .contentType("application/json")

                    // Validate Response Body
                    .body("firstName", equalTo("Rahul"))
                    .body("lastname", equalTo("Sharma"))
                    .body("address", equalTo("Delhi"))
                    .body("mobileNumber", equalTo(98765432))
                    .body("gender", equalTo("male"))

                    .extract()
                    .response();

        // Capture ID from POST Response
        String employeeId = postResponse.jsonPath().getString("id");

        System.out.println("Created Employee ID: " + employeeId);

        // GET Request using captured ID
        given()

        .when()
            .get("http://localhost:3000/employees/" + employeeId)

        .then()
            .statusCode(200)
            .contentType("application/json")

            // Validate ID
            .body("id", equalTo(employeeId))

            // Validate Employee Details
            .body("firstName", equalTo("Rahul"))
            .body("lastname", equalTo("Sharma"))
            .body("address", equalTo("Delhi"))
            .body("mobileNumber", equalTo(98765432))
            .body("gender", equalTo("male"));

        System.out.println("GET validation completed successfully.");
    }
}