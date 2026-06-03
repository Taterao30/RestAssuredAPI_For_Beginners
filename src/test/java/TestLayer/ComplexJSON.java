package TestLayer;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ComplexJSON {

	public static void main(String[] args) {

		given()

	    .log().all()                 // Log Request Details

	.when()
	    .get("http://localhost:3001/users")

	.then()
	    .log().all()                 // Log Complete Response
	    .statusCode(200)

	    // Root Level
	    .body("[0].id", equalTo("101"))
	    .body("[0].name", equalTo("Taterao Gaikwad"))
	    .body("[0].email", equalTo("taterao@example.com"))

	    // Profile
	    .body("[0].profile.age", equalTo(30))
	    .body("[0].profile.gender", equalTo("male"))

	    // Preferences
	    .body("[0].profile.preferences.notifications", equalTo(true))
	    .body("[0].profile.preferences.newsletter", equalTo(false))

	    // Languages
	    .body("[0].profile.preferences.languages[0]", equalTo("English"))
	    .body("[0].profile.preferences.languages[1]", equalTo("Hindi"))

	    // Sports
	    .body("[0].profile.preferences.sports[0].football", equalTo(true))
	    .body("[0].profile.preferences.sports[1].cricket", equalTo(false))
	    .body("[0].profile.preferences.sports[2].tennis", equalTo(true))

	    // Mumbai
	    .body("[0].profile.preferences.city[0].Mumbai.selected", equalTo(true))
	    .body("[0].profile.preferences.city[0].Mumbai.areas[0]", equalTo("CST"))
	    .body("[0].profile.preferences.city[0].Mumbai.areas[1]", equalTo("Thane"))
	    .body("[0].profile.preferences.city[0].Mumbai.areas[2]", equalTo("Kalyan"))

	    // Other Cities
	    .body("[0].profile.preferences.city[1].Pune", equalTo(false))
	    .body("[0].profile.preferences.city[2].Banglore", equalTo(true));
/**
 * [
  {
    "id": "101",
    "name": "Taterao Gaikwad",
    "email": "taterao@example.com",
    "profile": {
      "age": 30,
      "gender": "male",
      "preferences": {
        "notifications": true,
        "newsletter": false,
        "languages": [
          "English",
          "Hindi"
        ],
        "sports": [
          {
            "football": true
          },
          {
            "cricket": false
          },
          {
            "tennis": true
          }
        ],
        "city": [
          {
            "Mumbai": {
              "selected": true,
              "areas": [
                "CST",
                "Thane",
                "Kalyan"
              ]
            }
          },
          {
            "Pune": false
          },
          {
            "Banglore": true
          }
        ]
      }
    }
  }
]
 */
	}
}


