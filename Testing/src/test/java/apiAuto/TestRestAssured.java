package apiAuto;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Objects;

public class TestRestAssured {
    @Test
    public void getData(){

        File jsonSchema = new File("resources/jsonSchema/getUsersSchema.json");

        RestAssured
                .given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().all()
                .assertThat().statusCode(200)
//                .assertThat().body("per_page", Matchers.equalTo(6))
//                .assertThat().body("page", Matchers.equalTo(2))
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Test
    public void postData(){
        String valueName = "Micro";
        String valueJob  = "Dev";

        JSONObject bodyObj = new JSONObject();
        bodyObj.put("name", valueName);
        bodyObj.put("Job", valueJob);

        RestAssured.
                given()
                .header("Content-Type", "application/Json")
                .header("accept","application/Json")
                .body(bodyObj.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("name", Matchers.equalTo(valueName));

    }

//    @Test
//    public void putData(){
//        RestAssured.baseURI = "https://reqres.in/";
//        int userId = 408;
//        String newName = "Willy";
//
//        String fName = RestAssured.given().when().get("api/users/408").getBody().jsonPath().get("data.first_Name");
//        String lName = RestAssured.given().when().get("api/users/408").getBody().jsonPath().get("data.last_Name");
//        String avatar = RestAssured.given().when().get("api/users/408").getBody().jsonPath().get("data.avatar");
//        String email = RestAssured.given().when().get("api/users/408").getBody().jsonPath().get("data.email");
//        System.out.println("name before" + fName);
//
//        HashMap<String, Object> bodyMap = new HashMap<>();
//        bodyMap.put("id", userId);
//        bodyMap.put("email", email);
//        bodyMap.put("first_Name", newName);
//        bodyMap.put("last_Name", lName);
//        bodyMap.put("avatar", avatar);
//        JSONObject jsonObject = new JSONObject(bodyMap);
//
//        RestAssured.given().log().all()
//                .header("Content-Type", "application/Json")
//                .body(jsonObject.toString())
//                .put("api/users/408")
//                .then().log().all()
//                .assertThat().statusCode(200)
//                .assertThat().body("first_Name", Matchers.equalTo(newName));
//    }
//
//    @Test
//    public void patchData(){
//        RestAssured.baseURI = "https://reqres.in/";
//        int userId = 408;
//        String newName = "andre";
//
//        String fname = RestAssured.given().when().get("api/users/408")
//                .getBody().jsonPath().get("data.first_Name");
//        System.out.println("name_Before = " + fname );
//
//        HashMap<String, String> bodyMap = new HashMap<>();
//        bodyMap.put("first_Name", newName);
//        JSONObject jsonObject = new JSONObject(bodyMap);
//
//        RestAssured.given().log().all()
//                .header("Content-Type", "application/Json")
//                .body(jsonObject.toString())
//                .patch("api/users/408")
//                .then().log().all()
//                .assertThat().statusCode(200)
//                .assertThat().body("first_Name ", Matchers.equalTo(newName));
//    }
//
//    @Test
//    public void deleteData(){
//        RestAssured.baseURI = "https://reqres.in/";
//        int userDelete = 408;
//        RestAssured
//                .given().log().all().when()
//                .delete("api/users/408")
//                .then().log().all()
//                .assertThat().statusCode(204);
//    }
}
