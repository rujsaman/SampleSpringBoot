package com.merkle.exsgiincstore.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merkle.exsgiincstore.model.StoreModel;
import com.merkle.exsgiincstore.model.ToyModel;
import com.merkle.exsgiincstore.repository.StoreRepository;
import com.merkle.exsgiincstore.repository.StoreToyRepository;

@Service
public class ToyService implements IToyService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ToyService.class);
	
	@Autowired
	StoreRepository storeRepo;
	
	@Autowired
	StoreToyRepository storeToyRepo;

	@Override
	public StoreModel getAllToysOfStore(String storeName) {
		StoreModel storeModel = storeRepo.getStoreByName(storeName);
		if(storeModel==null)
			LOGGER.warn("Store is not present with name : "+storeName);
		else {
			List<ToyModel> toyList = storeToyRepo.findAllToysForStore(storeModel.getId());
			storeModel.setToys(toyList);
			LOGGER.info("Successfully fetched "+storeName+" details and available toys info");
		}
		return storeModel;
	}
	

}
