package com.merkle.exsgiincstore.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.merkle.exsgiincstore.model.StoreModel;
import com.merkle.exsgiincstore.service.IStoreService;

@RestController
public class StoreResource {
	
	private static final Logger logger = LoggerFactory.getLogger(StoreResource.class);
	
	@Autowired
	IStoreService storeService;
	
	@RequestMapping(value="/stores")
	public List<StoreModel> getAllStores(){
		logger.debug("Getting all the stores");
		return storeService.getAllStores();
	}
	

}
