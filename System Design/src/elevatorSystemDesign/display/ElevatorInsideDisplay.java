package elevatorSystemDesign.display;

import elevatorSystemDesign.enums.ElevatorMovementDirection;
import elevatorSystemDesign.enums.ElevatorStates;

public class ElevatorInsideDisplay implements Display{
    @Override
    public void display(int floor, ElevatorMovementDirection elevatorMovementDirection, ElevatorStates elevatorStates){
        System.out.println("Internal Display  --  " + elevatorMovementDirection.getDirectionRepresentation() + " " + floor + " " + elevatorStates);
    }
}
