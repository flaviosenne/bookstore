package com.joao.bookstoremanager.repository;

import com.joao.bookstoremanager.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
    
}
