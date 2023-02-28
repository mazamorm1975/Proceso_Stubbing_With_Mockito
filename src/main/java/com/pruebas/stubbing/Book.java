package com.pruebas.stubbing;

import java.time.LocalDate;
import java.time.LocalTime;

public class Book {

    private String bookdId;
    private String bookTitle;
    private LocalDate publishingDate;
    private int price;

    public String getBookdId() {
        return bookdId;
    }

    public void setBookdId(String bookdId) {
        this.bookdId = bookdId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    public Book(String bookdId, String bookTitle, LocalDate publishingDate, int price) {
        this.bookdId = bookdId;
        this.bookTitle = bookTitle;
        this.publishingDate = publishingDate;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
