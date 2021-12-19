package com.ciclo4.retos;

import com.ciclo4.retos.repository.crud.ProductCrudRepository;
import com.ciclo4.retos.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 *
 * @author miguel
 */

@Component
@SpringBootApplication
public class RetosApplication implements CommandLineRunner{
    
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired

	public static void main(String[] args) {
		SpringApplication.run(RetosApplication.class, args);         
	}
        
        @Override
    public void run(String... args) throws Exception {
        productCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
    }

}
