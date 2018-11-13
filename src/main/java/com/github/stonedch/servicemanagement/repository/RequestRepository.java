package com.github.stonedch.servicemanagement.repository;

import com.github.stonedch.servicemanagement.domain.Request;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RequestRepository extends CrudRepository<Request, Long> {

    Optional<Request> findById(Long var1);
}