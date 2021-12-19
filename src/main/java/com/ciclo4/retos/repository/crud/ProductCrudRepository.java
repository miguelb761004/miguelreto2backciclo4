package com.ciclo4.retos.repository.crud;

import com.ciclo4.retos.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
   

}
