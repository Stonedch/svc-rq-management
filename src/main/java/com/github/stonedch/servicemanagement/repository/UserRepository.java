package com.github.stonedch.servicemanagement.repository;

import com.github.stonedch.servicemanagement.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    User findByLoginAndPassword(String login, String password);
}
