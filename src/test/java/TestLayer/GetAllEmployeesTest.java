package TestLayer;


	
	import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;



public class GetAllEmployeesTest {

	public static void main(String[] args)
	{



		        given()

		        .when()
		            .get("http://localhost:3000/employees")

		        .then()
		            .statusCode(200)
		            .statusLine("HTTP/1.1 200 OK")
		            .contentType("application/json")

		            // Employee 1
		            .body("[0].id", equalTo("1"))
		            .body("[0].firstName", equalTo("Anjali"))
		            .body("[0].lastname", equalTo("Patil"))
		            .body("[0].address", equalTo("Pune"))
		            .body("[0].mobileNumber", equalTo(90909090))
		            .body("[0].gender", equalTo("female"))

		            // Employee 2
		            .body("[1].id", equalTo("2"))
		            .body("[1].firstName", equalTo("Rohit"))
		            .body("[1].lastname", equalTo("Sathe"))
		            .body("[1].address", equalTo("Mumbai"))
		            .body("[1].mobileNumber", equalTo(80808080))
		            .body("[1].gender", equalTo("male"));
		        
		        

/**
 * Response body
 * 
 * 
  {
    "id": "1",
    "firstName": "Anjali",
    "lastname": "Patil",
    "address": "Pune",
    "mobileNumber": 90909090,
    "gender": "female"
  },
  {
    "id": "2",
    "firstName": "Rohit",
    "lastname": "Sathe",
    "address": "Mumbai",
    "mobileNumber": 80808080,
    "gender": "male"
  }
]
 * 
 * 
 * 
 */
		          
		    }
		}




