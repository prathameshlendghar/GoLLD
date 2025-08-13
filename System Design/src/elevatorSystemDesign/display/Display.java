package elevatorSystemDesign.display;

import elevatorSystemDesign.enums.ElevatorMovementDirection;
import elevatorSystemDesign.enums.ElevatorStates;

public interface Display {
    public void display(int floor, ElevatorMovementDirection elevatorMovementDirection, ElevatorStates elevatorStates);
}
