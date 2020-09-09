package com.merkle.exsgiincstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.merkle.exsgiincstore.entity.StoreToyEntity;
import com.merkle.exsgiincstore.entity.ToyEntity;
import com.merkle.exsgiincstore.model.ToyModel;


@Repository
public interface StoreToyRepository  extends CrudRepository<StoreToyEntity, Integer>{

	List<ToyModel> findAllToysForStore(@Param ("storeId")Integer storeId);
}
