package httpTestPkg;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class HttpPostReqEmp {

	public static void main(String[] args) {

		  String requestBody = "{\r\n"
		  		+ "            \"firstName\":\"Suraj\",\r\n"
		  		+ "            \"lastname\":\"Gaikwad\",\r\n"
		  		+ "            \"address\":\"Pune\",\r\n"
		  		+ "            \"mobileNumber\":9876543210,\r\n"
		  		+ "            \"gender\":\"Male\"\r\n"
		  		+ "        }";
		  
		
		RestAssured.baseURI = "http://localhost:3000/employees";
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.contentType(ContentType.JSON)
        .body(requestBody)
        .when()
        .post()
        .then()
        .statusCode(201)
        .body(
            "firstName", equalTo("Suraj"),
            "lastname", equalTo("Gaikwad"),
            "address", equalTo("Pune"),
            "mobileNumber", equalTo(9876543210L),
            "gender", equalTo("Male")
        ).contentType(ContentType.JSON)
        .log().all();
		

	}

}
