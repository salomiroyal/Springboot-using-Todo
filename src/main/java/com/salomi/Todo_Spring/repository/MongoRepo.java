package com.salomi.Todo_Spring.repository;

import com.salomi.Todo_Spring.model.Todomodel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo  extends MongoRepository<Todomodel,String >{

}
