package estudos.restassured.model;

import java.util.Date;

/**
 * Classe que representa um Personagem na api SWAPI
 * @author Emanuel
 *
 */
public class Personagem {
	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	private String[] films;
	private String[] species;
	private String[] vehicles;
	private String[] starships;
	private Date created;
	private Date edited;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMass() {
		return mass;
	}
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getHair_color() {
		return hair_color;
	}
	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}
	public String getSkin_color() {
		return skin_color;
	}
	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}
	public String getEye_color() {
		return eye_color;
	}
	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}
	public String getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHomeworld() {
		return homeworld;
	}
	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}
	public String[] getFilms() {
		return films;
	}
	public void setFilms(String[] films) {
		this.films = films;
	}
	public String[] getSpecies() {
		return species;
	}
	public void setSpecies(String[] species) {
		this.species = species;
	}
	public String[] getVehicles() {
		return vehicles;
	}
	public void setVehicles(String[] vehicles) {
		this.vehicles = vehicles;
	}
	public String[] getStarships() {
		return starships;
	}
	public void setStarships(String[] starships) {
		this.starships = starships;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getEdited() {
		return edited;
	}
	public void setEdited(Date edited) {
		this.edited = edited;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
