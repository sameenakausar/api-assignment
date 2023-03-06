package api.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class updateUser {

	@Test(priority = 1)
	public void update1() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().pathParam("id", "1")
		.when().put("/users/{id}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();

	}
	
	@Test(priority = 2)
	public void update2() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().pathParam("id", "7")
		.when().put("/user/{id}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();

	}
	
	
	

}
