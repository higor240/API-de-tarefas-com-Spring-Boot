package com.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entity.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {
    
}
