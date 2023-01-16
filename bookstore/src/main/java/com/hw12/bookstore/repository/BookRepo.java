package com.hw12.bookstore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hw12.bookstore.datamodel.Book;


public interface BookRepo extends JpaRepository <Book,Integer>{
    
}
