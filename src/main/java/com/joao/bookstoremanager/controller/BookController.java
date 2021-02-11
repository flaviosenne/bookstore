package com.joao.bookstoremanager.controller;

import com.joao.bookstoremanager.dto.MessageResponseDTO;
import com.joao.bookstoremanager.entity.Book;
import com.joao.bookstoremanager.repository.BookRepository;
import com.joao.bookstoremanager.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    
    private BookService bookService;
   

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        return this.bookService.create(book);
    }
    
}
