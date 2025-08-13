package elevatorSystemDesign.display;

import elevatorSystemDesign.enums.ElevatorMovementDirection;
import elevatorSystemDesign.enums.ElevatorStates;

public class FloorOutsideDisplay implements Display{
    @Override
    public void display(int floor, ElevatorMovementDirection elevatorMovementDirection, ElevatorStates elevatorStates){
        System.out.println("External Display  --  " + elevatorMovementDirection.getDirectionRepresentation() + " " + floor + " " + elevatorStates);
    }
}
