package CarRentalSystemDesign;

import CarRentalSystemDesign.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehicles;

    VehicleInventory(){
        vehicles = new ArrayList<>();
    }

    VehicleInventory(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }


}
