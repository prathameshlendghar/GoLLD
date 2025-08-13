package elevatorSystemDesign.enums;

public enum ElevatorDoorState {
    CLOSE("close"),
    OPEN("open");

    final String doorState;
    ElevatorDoorState(String doorState){
        this.doorState = doorState;
    }

    public String getDoorState(){
        return doorState;
    }
}
