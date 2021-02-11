package com.joao.bookstoremanager.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.joao.bookstoremanager.entity.Author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Integer id;
    
    @NotBlank
    @Size(max = 200)
    private String name;
    
    @NotNull
    private Integer pages;
    
    @NotNull
    private Integer chapters;
    
    @NotBlank
    @Size(max = 100)
    @Pattern(regexp = "(?:ISBN(?:10)?:? )?(?=[0-9x]-{10}$|(?=(?:[0-9]+[- ])",
        message = "ISBN format must be a valid format")
    private String isbn;
    
    @NotBlank
    @Size(max = 200)
    private String publisherName;
    
    @Valid
    @NotNull
    private Author author;
}
