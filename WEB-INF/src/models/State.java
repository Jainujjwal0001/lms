package models;

public class State {

    // ##################### State Properties ##############################
    private Integer stateId;
    private String state;

    // ##################### State Constructors ##############################
    public State() {

    }

    
    // ##################### State getter-setters ##################################
    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}