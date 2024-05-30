package models;

public class City{
    
    // #####################  Properties ##############################
    private Integer cityId;
    private String city;
    private State state;

    // #####################  Constructors ##############################
    public City() {

    }

     
    // #####################  getter-setters ##################################
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}