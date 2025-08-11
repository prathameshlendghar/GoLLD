package CarRentalSystemDesign.types;

public enum BikeType implements VehicleType{
    SPORTSBIKE("Sports Bike"),
    OFFROADBIKE("Off Road Bike"),
    REGULARBIKE("Regular Bike");

    final String type;
    BikeType(String type){
        this.type = type;
    }

    public String toString(){
        return type;
    }
}
