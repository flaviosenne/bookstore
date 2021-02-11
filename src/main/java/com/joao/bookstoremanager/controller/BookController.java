package com.joao.bookstoremanager.controller;

import javax.validation.Valid;

import com.joao.bookstoremanager.dto.BookDTO;
import com.joao.bookstoremanager.dto.MessageResponseDTO;


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
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return this.bookService.create(bookDTO);
    }
    
}
