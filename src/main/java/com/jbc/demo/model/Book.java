package com.jbc.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min=4)
    private String title;
    @NotNull
    @Size(min=4)
    private String author;
    @NotNull
    @Min(3)
    private int publication_year;
    private String isbn_num;
    private String image;
    private boolean status=true;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setNewStatus(boolean newStatus) {
        status = newStatus;
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

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
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


}

