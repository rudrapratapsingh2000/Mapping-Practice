package com.MappingPractice.controller;

import com.MappingPractice.model.AddressModel;
import com.MappingPractice.model.BookModel;
import com.MappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books-api")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    public void addBook(@RequestBody BookModel book)
    {
        bookService.addBook(book);
    }
    @GetMapping("/getallbooks")
    List<BookModel> getAllBooks() {
        return bookService.getAllBooks();
    }
    @PutMapping("/update-api/number/{number}")
    public  void updateBook(@PathVariable String number, @RequestBody BookModel bookModel){
        bookService.updateBook(number,bookModel);
    }

    @DeleteMapping("/deletebook/number/{number}")
    public void deletebook(@PathVariable String number)
    {
        bookService.deletebook(number);
    }

    }
