package models;

public class Status {

    // ##################### Status Properties ##############################
    private Integer statusId;
    private String name;

    
    // ##################### Status Constructors ##############################
    public Status() {

    }


    // ##################### Status getter-setters ##################################
    public Integer getStatusId() {
        return statusId;
    }
    
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}