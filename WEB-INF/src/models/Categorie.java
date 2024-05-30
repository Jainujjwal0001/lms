package models;

public class Categorie {

    // ##################### Categorie Properties ##############################
    private Integer categorieId;
    private String name;

    // ##################### Categorie Constructors ##############################
    public Categorie() {

    }


    // ##################### Categorie getter-setters ##################################
    public Integer getCategorieId() {
        return categorieId;
    }
    
    public void setCategorieId(Integer categorieId ) {
        this.categorieId = categorieId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}