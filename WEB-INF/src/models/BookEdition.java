package models;

import java.sql.Date;

public class BookEdition {

    private Integer bookEditionId;
    private Book book;
    private String edition;
    private Date publishedOn;
    private Integer price;
    private String details;

    public BookEdition() {

    }


    public Integer getBookEdition() {
        return bookEditionId;
    }

    public void setBookEdition(Integer bookEditionId) {
        this.bookEditionId = bookEditionId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}