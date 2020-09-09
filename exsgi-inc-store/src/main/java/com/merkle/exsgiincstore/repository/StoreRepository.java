package com.merkle.exsgiincstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.merkle.exsgiincstore.entity.StoreEntity;
import com.merkle.exsgiincstore.model.StoreModel;

@Repository
public interface StoreRepository extends CrudRepository<StoreEntity, Integer>{
	
	List<StoreModel> getAllStores();
	
	StoreModel getStoreByName(@Param ("name") String name);
	
	StoreEntity findByName(String storeName);
	
}
