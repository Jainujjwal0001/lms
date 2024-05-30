package models;


import java.sql.Time;

public class Librarie {
    
    // ##################### Librarie Properties ##############################
    private Integer libraryId;
    private User user;
    private String details;
    private String website;
    private Time openTiming;
    private Time closeTiming;
    private Integer bookIssueDays;
    private Integer lateFine;
    private Integer depositeAmount;

    
    // ##################### Librarie Constructors ##############################
    public Librarie() {

    }

    // ##################### Librarie getter-setters ##################################

    public Integer getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Integer libraryId) {
        this.libraryId = libraryId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Time getOpenTiming() {
        return openTiming;
    }

    public void setOpenTiming(Time openTiming) {
        this.openTiming = openTiming;
    }

    public Time getCloseTiming() {
        return closeTiming;
    }

    public void setCloseTiming(Time closeTiming) {
        this.closeTiming = closeTiming;
    }

    public Integer getBookIssueDays() {
        return bookIssueDays;
    }

    public void setBookIssueDays(Integer bookIssueDays) {
        this.bookIssueDays = bookIssueDays;
    }

    public Integer getLateFine() {
        return lateFine;
    }

    public void setLateFine(Integer lateFine) {
        this.lateFine = lateFine;
    }

    public Integer getDepositeAmount() {
        return depositeAmount;
    }

    public void setDepositeAmount(Integer depositeAmount) {
        this.depositeAmount = depositeAmount;
    }
}