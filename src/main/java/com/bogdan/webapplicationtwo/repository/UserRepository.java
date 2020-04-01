package com.bogdan.webapplicationtwo.repository;

import com.bogdan.webapplicationtwo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);

    User findById(long id);
}
