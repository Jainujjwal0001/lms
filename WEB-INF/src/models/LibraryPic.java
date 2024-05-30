package models;

public class LibraryPic {

    // ##################### LibraryPic Properties ##############################
    private Integer libraryPicId;
    private Librarie library;
    private String picPath;

    
    // ##################### LibraryPic Constructors ##############################
    public LibraryPic() {

    }

    // ##################### Librarie getter-setters ###############################
    public Integer getLibraryPicId() {
        return libraryPicId;
    }

    public void setLibraryPicId(Integer libraryPicId) {
        this.libraryPicId = libraryPicId;
    }

    public Librarie getLibrary() {
        return library;
    }

    public void setLibrary(Librarie library) {
        this.library = library;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

}