package com.example.task.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.task.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

    User findByLoginAndPassword(String login, String password);
}
