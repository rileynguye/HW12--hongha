package com.hw12.bookstore.datamodel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;
    private String name;
    private String author;
    private int dateYear;
    private float price;

    public Book(){}
    
    public Book(Integer iD, String name, String author, int dateYear, float price) {
        id = iD;
        this.name = name;
        this.author = author;
        this.dateYear = dateYear;
        this.price = price;
    }

    

    public Integer getid() {
        return id;
    }

    public void setID(Integer iD) {
        id = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }

    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price =price;
    }
    
    

    
}
