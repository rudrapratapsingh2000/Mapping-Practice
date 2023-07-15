package com.MappingPractice.service;

import com.MappingPractice.model.BookModel;
import com.MappingPractice.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public void addBook(BookModel book) {
        bookRepo.save(book);
    }

    public List<BookModel> getAllBooks() {
        return  bookRepo.findAll();
    }

    public void deletebook(String number) {
        bookRepo.deleteById(number);
    }

    public void updateBook(String number, BookModel bookModel) {
        BookModel bookModel1=bookRepo.findById(number).orElse(null);
        bookModel1.setAuthor(bookModel.getAuthor());
        bookModel1.setTitle(bookModel.getTitle());
        bookModel1.setPrice(bookModel.getPrice());
        bookModel1.setStudent(bookModel.getStudent());
        bookModel1.setDescription(bookModel.getDescription());
        bookRepo.save(bookModel1);
    }
}
