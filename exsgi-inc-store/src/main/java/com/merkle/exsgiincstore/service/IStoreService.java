package com.merkle.exsgiincstore.service;

import java.util.List;

import com.merkle.exsgiincstore.entity.StoreEntity;
import com.merkle.exsgiincstore.model.StoreModel;

public interface IStoreService {

	public List<StoreModel> getAllStores();
}
