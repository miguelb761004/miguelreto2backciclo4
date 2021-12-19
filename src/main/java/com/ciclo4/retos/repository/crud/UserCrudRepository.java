package com.ciclo4.retos.repository.crud;

import com.ciclo4.retos.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author miguel
 */

public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional <User> findByEmailAndPassword(String email,String password);
    Optional<User> findByNameOrEmail(String name, String email);

    

}
