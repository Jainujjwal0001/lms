package models;

public class Book {

    // ##################### Book Properties ##############################
    private Integer bookId;
    private String isbnNo;
    private String title;
    private Categorie categorieId;
    private Publisher publisherId;
    
    // ##################### Book Constructors ############################## 
    public Book() {

    }

    
    // ##################### Book getter-setters ##################################
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Categorie getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Categorie categorieId) {
        this.categorieId = categorieId;
    
    }

    public Publisher getPublisher() {
        return publisherId;
    }
    
    public void setPublisher(Publisher publisherId) {
        this.publisherId = publisherId;
    }


}