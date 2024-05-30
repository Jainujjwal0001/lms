package models;

public class Gender {
    
    // ##################### Gender Properties ############################## 
    private Integer genderId;
    private String gender;

    // ##################### Student Constructors ##########################
    public Gender() {

    }

    // ##################### Gender getter-setters ##################################
        public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

}