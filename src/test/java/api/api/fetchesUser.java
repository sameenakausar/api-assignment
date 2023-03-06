package api.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class fetchesUser {

	@Test
	public void fetch() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api";
		String response = given().log().all().pathParam("id", "2")
		.when().get("users/{id}")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
//		JsonPath js = new JsonPath(response);
//		String actualData = js.getString("data");
//		System.out.println(actualData);
		
	}
	
	@Test
	public void fetch1() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().pathParam("id", "6")
		.when().get("user/{id}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	
	
	@Test
	public void fetch2() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api";
		given().log().all().pathParam("id","9")
		.when().get("users/{id}")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
	}
	
	
	
	

}
