package com.pl.demo.repository;

import com.pl.demo.entity.HelloEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends CrudRepository<HelloEntity, Integer> {

}
