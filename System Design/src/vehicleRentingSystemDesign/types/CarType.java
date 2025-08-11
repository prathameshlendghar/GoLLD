package vehicleRentingSystemDesign.types;

public enum CarType implements VehicleType{
    NORMALCAR("Normal Car"),
    SUVCAR("SUV Car"),
    LUXARYCAR("Luxary Car"),
    SPORTSCAR("Sports Car"),
    FOURBYFOUROFFROADCAR("Four By Four Off Road Car");

    final String type;
    CarType(String type){
        this.type = type;
    }

    public String toString(){
        return type;
    }
}
