package TestLayer;

import static io.restassured.RestAssured.*;

public class TokenManager {

    private static String token;

    public static String getToken() {

        if (token == null) {

            token =
                    given()
                    .contentType("application/json")
                    .body("{\"username\":\"admin\",\"password\":\"admin123\"}")
                    .when()
                    .post("/login")
                    .jsonPath()
                    .getString("token");
        }

        return token;
    }
}