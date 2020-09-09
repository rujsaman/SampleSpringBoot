package com.merkle.exsgiincstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.merkle.exsgiincstore.entity.ToyEntity;

@Repository
public interface ToyRepository extends CrudRepository<ToyEntity, Integer>{

}
