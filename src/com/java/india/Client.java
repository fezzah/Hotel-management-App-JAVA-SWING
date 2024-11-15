package com.java.india;

public class Client {
	private String id;
	private String name;
	private String city;
	private String country;

	public Client() {
	}

	public Client(String id, String name, String city, String country) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}

}
