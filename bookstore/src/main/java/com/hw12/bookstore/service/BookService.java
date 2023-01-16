package com.hw12.bookstore.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import java.util.Comparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hw12.bookstore.datamodel.Book;
import com.hw12.bookstore.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<Book> findBook(){
        return bookRepo.findAll();

    }
    public Optional<Book> fetchBook(int id){
        return bookRepo.findById(id);

    }
    public Book addBook(Book book){
        return bookRepo.save(book);

    }
    public boolean deleteBook(int id){
        boolean status;
        try {
            bookRepo.deleteById(id);
            status=true;
        } catch (Exception e) {
            status=false;
        }
        return status;

    }
    public Book findOldestBook(){
        List <Book> books = new ArrayList<>();
        Collections.sort(books, new Comparator<Book>()
        {
            public int compare (Book b1,Book b2){
                return Integer valueOf(b1.getDateYear()).compareTo(b2.getDateYear());
            }
        }); 
    }
    
}
