package com.merkle.exsgiincstore.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.merkle.exsgiincstore.entity.StoreEntity;

@Entity
@Table(name="TOY")
public class ToyEntity implements Serializable{

	@Id
	@Column(name="ID")
	int id;
	@Column(name="NAME")
	String name;
	@Column(name="MANUFACTURERNAME")
	String manufacturerName;
	@Column(name="COLOR")
	String color;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="ID")
	List<StoreToyEntity> storeToyList;
	
	
	public ToyEntity() {}
	
	public ToyEntity(int id, String name, String manufacturerName, String color) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturerName = manufacturerName;
		this.color = color;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
