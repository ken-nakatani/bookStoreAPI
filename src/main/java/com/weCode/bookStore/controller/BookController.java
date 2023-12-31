package com.weCode.bookStore.controller;

import com.weCode.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book = BookDto.builder()
                .title("My first book title")
                .build();

        BookDto bookSecond = BookDto.builder()
                .title("My Second book title")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(book);
        books.add(bookSecond);
        return ResponseEntity.ok(books);

    }
}
