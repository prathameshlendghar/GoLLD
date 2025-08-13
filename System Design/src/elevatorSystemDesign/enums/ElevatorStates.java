package elevatorSystemDesign.enums;

public enum ElevatorStates {
    IDLE("Idle"),
    IDLEDOOROPEN("IdleDoorOpen"),
    MOVING("Moving"),
    MAINTENANCE("Maintenance"),
    EMERGENCY("Emergency");

    final String state;
    ElevatorStates(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
