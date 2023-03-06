package api.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import files.payload;

public class registerUser {

	@Test(priority = 1)
	public void register1() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().header("content-type", "application/json")
		.body(payload.userData1())
		.when().post("/register")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
		
		
	@Test(priority = 2)
	public void register2() {
		
		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().header("content-type", "application/json")
		.body(payload.userData1())
		.when().post("/register")
		.then().log().all().assertThat().statusCode(400).body("error", equalTo("Note: Only defined users succeed registration")).extract().response().asString();

	}
	
	@Test(priority = 3)
	public void register3() {
		
		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().header("content-type", "application/json")
		.body(payload.userData1())
		.when().post("/registers")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();

	}
	
	
	@Test(priority = 4)
	public void register4() {
		
		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().header("content-type", "application/json")
		.body(payload.userData2())
		.when().post("/registers")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();

	}

}
