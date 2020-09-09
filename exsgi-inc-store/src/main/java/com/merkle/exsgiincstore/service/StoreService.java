package com.merkle.exsgiincstore.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merkle.exsgiincstore.model.StoreModel;
import com.merkle.exsgiincstore.repository.StoreRepository;
import com.merkle.exsgiincstore.repository.StoreToyRepository;

@Service
public class StoreService implements IStoreService{

	private static final Logger LOGGER = LoggerFactory.getLogger(StoreService.class);
	
	@Autowired
	StoreRepository storeRepo;
	
	@Autowired
	StoreToyRepository storeToyRepo;
	
	
	@Override
	public List<StoreModel> getAllStores() {
		List<StoreModel> storeList = storeRepo.getAllStores();
		if(storeList==null || storeList.isEmpty()) {
			LOGGER.warn("Currently no stores available");
		}
		return storeList;
	}

}
