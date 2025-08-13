package elevatorSystemDesign.display;

import elevatorSystemDesign.enums.ElevatorMovementDirection;
import elevatorSystemDesign.enums.ElevatorStates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DisplayObservable {
    private Set<Display> displays;
    private DisplayObservable displayObservable = new DisplayObservable();

    private DisplayObservable(){
        displays = new HashSet<>();
    }

    public void addObserver(Display display){
        displays.add(display);
    }

    public void removeObserver(Display display){
        displays.remove(display);
    }

    public void notifyChange(int floor, ElevatorMovementDirection elevatorMovementDirection, ElevatorStates elevatorStates){
        for(Display display: displays){
            display.display(floor,elevatorMovementDirection, elevatorStates);
        }
    }
}
