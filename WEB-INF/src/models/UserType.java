package models;

public class UserType {

    // ##################### UserType Properties ##############################
    private Integer userTypeId;
    private String type;

    // ##################### UserType Constructors ############################## 
    // public UserType() {

    // }

    
    // ##################### UserType getter-setters ##################################
    public Integer getUserTypeId() {
        return userTypeId;
    }
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}