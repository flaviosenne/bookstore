package com.joao.bookstoremanager.repository;

import com.joao.bookstoremanager.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
