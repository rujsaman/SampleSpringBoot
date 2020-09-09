package com.merkle.exsgiincstore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class StoreModel {

	private Integer id;
	
	@JsonInclude(Include.NON_EMPTY)
	private String name;
	
	@JsonInclude(Include.NON_EMPTY)
	private String email;
	
	@JsonInclude(Include.NON_EMPTY)
	private String country;
	
	@JsonInclude(Include.NON_EMPTY)
	private String region;
	
	@JsonInclude(Include.NON_EMPTY)
	List<ToyModel> toys;
	
	
	public StoreModel(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public StoreModel(Integer id, String name, String email, String country, String region) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
		this.region = region;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public List<ToyModel> getToys() {
		return toys;
	}
	public void setToys(List<ToyModel> toys) {
		this.toys = toys;
	}
	
	
}
