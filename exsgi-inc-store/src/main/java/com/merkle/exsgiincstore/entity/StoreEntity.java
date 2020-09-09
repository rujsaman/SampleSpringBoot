package com.merkle.exsgiincstore.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="STORE")
@NamedQuery(name="StoreEntity.getAllStores",
query="select new com.merkle.exsgiincstore.model.StoreModel(s.id, s.name, s.email) from StoreEntity s")
@NamedQuery(name="StoreEntity.getStoreByName",
query="select new com.merkle.exsgiincstore.model.StoreModel(s.id, s.name, s.email, s.country, s.region) from StoreEntity s where s.name = :name")
public class StoreEntity implements Serializable{
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="REGION")
	private String region;
	
	public StoreEntity() {}
	
	public StoreEntity(int id, String name, String email, String country, String region) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
		this.region = region;
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

	
}
