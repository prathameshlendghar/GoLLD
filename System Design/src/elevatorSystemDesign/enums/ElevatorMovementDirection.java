package elevatorSystemDesign.enums;

public enum ElevatorMovementDirection {
    UP("^"),
    DOWN("v"),
    IDLE("-");
    final String directionRepresentation;
    ElevatorMovementDirection(String directionRepresentation){
        this.directionRepresentation = directionRepresentation;
    }

    public String getDirectionRepresentation() {
        return directionRepresentation;
    }
}
