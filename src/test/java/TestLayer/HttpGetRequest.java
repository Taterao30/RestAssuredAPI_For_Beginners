package TestLayer;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpGetRequest {


		public static void main(String[] args) {
			// step 1; Set the Base URI
			RestAssured.baseURI = "http://localhost:3001/users";

			// step 2: get the Request specification object so we can select HTTP Request
			RequestSpecification httpRequest = RestAssured.given();

			// step 3: select the HTTP GET Request from RequestSpecification object
			Response resp = httpRequest.get();

			// step 4: capture status code from Response object
			System.out.println(resp.getStatusCode());
			System.out.println(resp.statusCode());

			// step 5: capture status line from Response Object
			System.out.println(resp.getStatusLine());
			System.out.println(resp.statusLine());

			// step 6: capture response time from Response Object
			System.out.println(resp.getTime());
			System.out.println(resp.time());

			// step 7: capture respoonse body from Response object
			System.out.println(resp.getBody().asString());
			System.out.println(resp.body().asString());

			// step 8: capture response headers from Response Object
			Headers allheader = resp.getHeaders();

			for (Header abc : allheader) {
				System.out.println(abc.getName() + "  ::  " + abc.getValue());
			}

		}

	}

