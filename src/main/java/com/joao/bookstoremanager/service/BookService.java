package com.joao.bookstoremanager.service;

import com.joao.bookstoremanager.dto.BookDTO;
import com.joao.bookstoremanager.dto.MessageResponseDTO;
import com.joao.bookstoremanager.entity.Book;
import com.joao.bookstoremanager.mapper.BookMapper;
import com.joao.bookstoremanager.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){

        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = this.bookRepository.save(bookToSave);
        
        return  MessageResponseDTO.builder()
        .message("Book created with ID: " + savedBook.getId())
        .build();
        
    }
}
