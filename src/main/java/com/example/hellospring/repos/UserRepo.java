package com.example.hellospring.repos;

import com.example.hellospring.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findBySecondName(String secondName);

}
