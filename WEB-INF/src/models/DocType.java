package models;

public class DocType {
    // ##################### DocType Properties ##############################
    private Integer docTypeId;
    private String type;

    // ##################### DocType Constructors ############################## 
    public DocType() {

    }
    
    
    // ##################### DocType getter-setters ##################################
    public Integer getDocTypeId() {
        return docTypeId;
    }
    
    public void setDocTypeId(Integer docTypeId) {
        this.docTypeId = docTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}