package models;

import java.sql.Date;


public class IssuedBook {

    private Integer issuedBookId;
    private BookEdition bookEdition;
    private Membership membership;
    private Date issueDate;
    private Date returnDate;
    private Integer fine;

    public IssuedBook() {

    }

    public Integer getIssuedBookId() {
        return issuedBookId;
    }

    public void setIssuedBookId(Integer issuedBookId) {
        this.issuedBookId = issuedBookId;
    }

    
    public BookEdition getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(BookEdition bookEdition) {
        this.bookEdition = bookEdition;
    }
    
    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    
    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }
}