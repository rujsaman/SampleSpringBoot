package com.merkle.exsgiincstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="STORE_TOY")
@NamedQuery( name="StoreToyEntity.findAllToysForStore",
query="SELECT new com.merkle.exsgiincstore.model.ToyModel(t.id, t.name, t.color) FROM StoreToyEntity st LEFT JOIN st.toyEntity t where st.storeId = :storeId")
public class StoreToyEntity{

	@Id
	@Column(name="STORE_TOY_ID")
	Integer storeToyId;
	
	@Column(name="TOY_ID")
	Integer toyId;
	
	@Column(name="STORE_ID")
	Integer storeId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="STORE_ID", insertable=false, updatable=false)
	StoreEntity storeEntity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TOY_ID",insertable=false, updatable=false)
	ToyEntity toyEntity;

	
	public Integer getStoreToyId() {
		return storeToyId;
	}

	public void setStoreToyId(Integer storeToyId) {
		this.storeToyId = storeToyId;
	}

	public StoreEntity getStoreEntity() {
		return storeEntity;
	}

	public void setStoreEntity(StoreEntity storeEntity) {
		this.storeEntity = storeEntity;
	}

	public ToyEntity getToyEntity() {
		return toyEntity;
	}

	public void setToyEntity(ToyEntity toyEntity) {
		this.toyEntity = toyEntity;
	}

	public Integer getToyId() {
		return toyId;
	}

	public void setToyId(Integer toyId) {
		this.toyId = toyId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
	
}
