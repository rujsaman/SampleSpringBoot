package com.merkle.exsgiincstore.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merkle.exsgiincstore.model.StoreModel;
import com.merkle.exsgiincstore.service.IToyService;

@RestController
public class ToyResource {

	@Autowired
	IToyService toyService;
	
	private static final Logger logger = LoggerFactory.getLogger(ToyResource.class);
	
	
	@RequestMapping(value="/toys/{storeName}")
	public StoreModel getAllToysOfStore(@PathVariable ("storeName") String storeName){
		logger.info("Getting stores description and toys in store :"+ storeName);
		return toyService.getAllToysOfStore(storeName);
	}
	
}
