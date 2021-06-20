package com.caffeineshawn.thebigiscoming.Entity;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity(name="book_table")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false,unique = true)
    private String title;

    @Column(nullable = false)
    private String author;


    private int quantity = 1;

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
