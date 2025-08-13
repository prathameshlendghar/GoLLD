package elevatorSystemDesign.elevatorDispatcher;

import elevatorSystemDesign.RequestButtons.ExternalRequest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ElevatorDispatcher {
    Set<ExternalRequest> externalRequestSet;

    ElevatorDispatcher(){
        externalRequestSet = new HashSet<>();
    }

    public void acceptRequest(ExternalRequest externalRequest){
        externalRequestSet.add(externalRequest);
    }

}
