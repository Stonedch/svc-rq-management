package com.example.task.repository;

import com.example.task.domain.Request;

import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Long> {

}