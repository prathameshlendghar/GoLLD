package elevatorSystemDesign;

import elevatorSystemDesign.enums.ElevatorDoorState;
import elevatorSystemDesign.enums.ElevatorStates;

public class Door {
    ElevatorDoorState doorState;

    Door(ElevatorStates elevatorStates, ElevatorDoorState elevatorDoorState){
        this.doorState = elevatorDoorState;
    }
    public void openDoor(){
        doorState = ElevatorDoorState.OPEN;
    }
    public void closeDoor(ElevatorStates elevatorStates){
        doorState = ElevatorDoorState.CLOSE;
    }
}
