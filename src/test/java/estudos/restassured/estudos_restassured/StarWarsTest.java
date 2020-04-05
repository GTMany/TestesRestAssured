package estudos.restassured.estudos_restassured;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;

import estudos.restassured.model.Personagem;


public class StarWarsTest {
	
	public StarWarsTest(){
		RestAssured.baseURI = "https://swapi.co/api/";	
	}
	
	@Test
	public void deveRetornarLukeSkywalker() {
		JsonPath json = given()
				.when()
			.get("/people").andReturn().jsonPath();
		
		Personagem luke = json.getObject("results[0]", Personagem.class);
		
		assertEquals("Luke Skywalker", luke.getName());
	}
	
	@Test
	public void deveRetornarListaDePersonagens() {
		given()
				.when()
			.get("/people")
			.then()
			.assertThat()
	        .body(matchesJsonSchemaInClasspath("schema_personagens.json"));
	}

}
