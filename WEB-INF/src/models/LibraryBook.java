package models;

public class LibraryBook {

    private Integer libraryBookId;
    private Librarie library;
    private BookEdition bookEdition;
    private Integer copies;
    private Integer bookIssued;
    private Boolean scraped;

    public LibraryBook() {

    } 

    public Integer getLibraryBookId() {
        return libraryBookId;
    }

    public void setLibraryBookId(Integer libraryBookId) {
        this.libraryBookId = libraryBookId;
    }

    public Librarie getLibrary() {
        return library;
    }
    
    public BookEdition getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(BookEdition bookEdition) {
        this.bookEdition = bookEdition;
    }
    

    public void setLibrary(Librarie library) {
        this.library = library;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getBookIssued() {
        return bookIssued;
    }

    public void setBookIssued(Integer bookIssued) {
        this.bookIssued = bookIssued;
    }

    public Boolean getScraped() {
        return scraped;
    }

    public void setScraped(Boolean scraped) {
        this.scraped = scraped;
    }

}