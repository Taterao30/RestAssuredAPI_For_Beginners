package TestLayer;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Employee;
public class EmployeeAPITest {
public static void main(String[] args) {
	
        // Create Request Object
        Employee requestEmployee = new Employee();

        requestEmployee.setId("3");
        requestEmployee.setFirstName("Rahul");
        requestEmployee.setLastname("Sharma");
        requestEmployee.setAddress("Delhi");
        requestEmployee.setMobileNumber(77777777);
        requestEmployee.setGender("male");

        // POST Request (Serialization)
        Response postResponse =

                given()
                    .contentType(ContentType.JSON)
                    .body(requestEmployee)

                .when()
                    .post("http://localhost:3000/employees");

        postResponse.then()
                    .statusCode(201);

        // Capture ID from POST Response
        String employeeId =
                postResponse.jsonPath().getString("id");

        System.out.println("Created Employee ID : " + employeeId);

        // GET Request using Captured ID
        Response getResponse =

                given()

                .when()
                    .get("http://localhost:3000/employees/" + employeeId);

        getResponse.then()
                   .statusCode(200);

        // Deserialization
        Employee responseEmployee = getResponse.as(Employee.class);

        //assertThat(responseEmployee.getId(), equalTo("3"));
        assertThat(responseEmployee.getFirstName(), equalTo("Rahul"));
        assertThat(responseEmployee.getLastname(), equalTo("Sharma"));
        assertThat(responseEmployee.getAddress(), equalTo("Delhi"));
        assertThat(responseEmployee.getMobileNumber(), equalTo(77777777L));
        assertThat(responseEmployee.getGender(), equalTo("male"));
        System.out.println("Employee Validated Successfully");
    }
}