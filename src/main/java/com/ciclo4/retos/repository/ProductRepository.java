package com.ciclo4.retos.repository;

import com.ciclo4.retos.model.Product;
import com.ciclo4.retos.repository.crud.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author miguel
 */

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return productCrudRepository.findAll();
    }

    public Optional<Product> getProduct(String reference) {
        return productCrudRepository.findById(reference);
    }

    public Product save(Product product) {
        return productCrudRepository.save(product);
    }

    public void update(Product product) {
        productCrudRepository.save(product);
    }

    public void delete(Product product) {
        productCrudRepository.delete(product);
    }


}

