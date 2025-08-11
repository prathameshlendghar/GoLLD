package vehicleRentingSystemDesign;

import vehicleRentingSystemDesign.types.VehicleType;
import vehicleRentingSystemDesign.vehicle.Vehicle;

import java.util.*;

public class VehicleInventory {
    Map<VehicleType, List<Vehicle>> vehiclesForRent, vehiclesOnRent;

    VehicleInventory(){
        vehiclesForRent = new HashMap<>();
        vehiclesOnRent = new HashMap<>();
    }

    VehicleInventory(Map<VehicleType, List<Vehicle>> vehiclesForRent, Map<VehicleType, List<Vehicle>> vehiclesOnRent){
        this.vehiclesForRent = vehiclesForRent;
        this.vehiclesOnRent = vehiclesOnRent;
    }

    public void addNewVehicle(Vehicle vehicle){
        List<Vehicle> temp = vehiclesForRent.get(vehicle.getVehicleType());
        temp.add(vehicle);
        vehiclesForRent.put(vehicle.getVehicleType(), temp);
    }

    public void backForRent(Vehicle vehicle){
        List<Vehicle> temp = vehiclesForRent.getOrDefault(vehicle.getVehicleType(), new ArrayList<Vehicle>());
        temp.add(vehicle);
        vehiclesForRent.put(vehicle.getVehicleType(), temp);
    }

    public void toRent(Vehicle vehicle){
        List<Vehicle> temp = vehiclesOnRent.getOrDefault(vehicle.getVehicleType(), new ArrayList<Vehicle>());
        temp.add(vehicle);
        vehiclesOnRent.put(vehicle.getVehicleType(), temp);
    }

    public void rentVehicle(String vehicleNumber, VehicleType vehicleType){
        Vehicle vehicle = null;
        Iterator<Vehicle> it = vehiclesForRent.getOrDefault(vehicleType, new ArrayList<>()).iterator();
        while (it.hasNext()){
            Vehicle temp = it.next();
            if(temp.getRegisteredNumber().equals(vehicleNumber)){
                vehicle = temp;
                it.remove();
                break;
            }
        }
        if(vehicle != null){
            toRent(vehicle);
        }
        else{
            System.out.println("No such vehicle found");
        }
    }

    public void getBackVehicle(String vehicleNumber, VehicleType vehicleType){
        Vehicle vehicle = null;
        Iterator<Vehicle> it = vehiclesOnRent.getOrDefault(vehicleType, new ArrayList<>()).iterator();
        while (it.hasNext()){
            Vehicle temp = it.next();
            if(temp.getRegisteredNumber().equals(vehicleNumber)){
                vehicle = temp;
                it.remove();
                break;
            }
        }
        if(vehicle != null){
            backForRent(vehicle);
        }
        else{
            System.out.println("No such vehicle found");
        }
    }


    public Map<VehicleType, List<Vehicle>> getVehiclesForRent() {
        return vehiclesForRent;
    }

    public void setVehiclesForRent(Map<VehicleType, List<Vehicle>> vehiclesForRent) {
        this.vehiclesForRent = vehiclesForRent;
    }

    public Map<VehicleType, List<Vehicle>> getVehiclesOnRent() {
        return vehiclesOnRent;
    }

    public void setVehiclesOnRent(Map<VehicleType, List<Vehicle>> vehiclesOnRent) {
        this.vehiclesOnRent = vehiclesOnRent;
    }
}
