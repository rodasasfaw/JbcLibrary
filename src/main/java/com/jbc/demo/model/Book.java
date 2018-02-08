package com.jbc.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
    private String publication_year;
    private String isbn_num;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book(String title) {
        this.title = title;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(String publication_year) {
        this.publication_year = publication_year;
    }

    public String getIsbn_num() {
        return isbn_num;
    }

    public void setIsbn_num(String isbn_num) {
        this.isbn_num = isbn_num;
    }

    public Book() {
    }

    public Book(String title, String author, String publication_year, String isbn_num, String status) {
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
        this.isbn_num = isbn_num;
        this.status = status;
    }
}

