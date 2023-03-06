package api.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class deleteUser {

	@Test(priority = 1)
	public void delete() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI= "https://reqres.in/api";
		given().log().all().pathParam("id", "1")
		.when().delete("/users/{id}")
		.then().log().all().assertThat().statusCode(204).extract().response().asString();

	}
	
	@Test(priority = 2)
	public void delete1() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI= "https://reqres.in/api";
		RequestSpecification response = given().log().all().pathParam("id", "1");
				
		Response req = response.header("content-type" , "application/json")
		.when().delete("/user/{id}");
		
		String str =  req.then().log().all().assertThat().statusCode(204).extract().response().asString();
		
		
		String serverType = req.header("Server");
		System.out.println(serverType);
		Assert.assertEquals(serverType, "cloudflare");

	}
	
	
	
	
	

}
