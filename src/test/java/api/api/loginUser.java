package api.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import files.payload;

public class loginUser {

	@Test(priority = 1)
	public void login1() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().header("content-type", "application/json") 
		.body(payload.userData1())
		.when().post("/login")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
	}
	
	@Test(priority = 2)
	public void login2() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().header("content-type", "application/json") 
		.body(payload.userData1())
		.when().post("/login")
		.then().log().all().assertThat().statusCode(400).body("error", equalTo("user not found")).header("server", equalTo("cloudflare")).extract().response().asString();
		
		
	}
	
//	@Test(priority = 3)
//	public void login3() {
//		// TODO Auto-generated method stub
//
//		RestAssured.baseURI = "https://reqres.in/api";
//		given().log().all().header("content-type", "application/json") 
//		.body(payload.userData2())
//		.when().post("/logins")
//		.then().log().all().assertThat().statusCode(200).extract().response().asString();
//		
//	}

}
