package vehicleRentingSystemDesign;

import vehicleRentingSystemDesign.types.VehicleType;
import vehicleRentingSystemDesign.vehicle.Vehicle;

import java.util.List;
import java.util.Map;

public class Store {
    VehicleInventory vehicleInventory;

    Store(VehicleInventory vehicleInventory){
        this.vehicleInventory = vehicleInventory;
    }
    Store(){
        this.vehicleInventory = new VehicleInventory();
    }
    Store(Map<VehicleType, List<Vehicle>> vehicleForRent, Map<VehicleType, List<Vehicle>> vehicleOnRent){
        this.vehicleInventory = new VehicleInventory(vehicleForRent, vehicleOnRent);
    }


    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

}
