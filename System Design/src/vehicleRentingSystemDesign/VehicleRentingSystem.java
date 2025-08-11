package vehicleRentingSystemDesign;

import vehicleRentingSystemDesign.types.VehicleType;
import vehicleRentingSystemDesign.vehicle.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRentingSystem {
    Map<Location, List<Store>> stores;

    VehicleRentingSystem(Map<Location, List<Store>> stores){
        this.stores = stores;
    }
    VehicleRentingSystem(){
        this.stores = new HashMap<>();
    }

    public List<Store> getStoreNearMyLocation(Location location){
        return stores.getOrDefault(location, null);
    }

    public Map<VehicleType, List<Vehicle>> getVehiclesInStore(Store store){
        return store.getVehicleInventory().getVehiclesForRent();
    }
    //Now i will have store, vehicleType, vehicle with me so I can now make the booking in Reservation class
}
