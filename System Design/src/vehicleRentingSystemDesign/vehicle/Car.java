package vehicleRentingSystemDesign.vehicle;

import vehicleRentingSystemDesign.types.VehicleType;
import vehicleRentingSystemDesign.user.Owner;

public class Car extends Vehicle{
    public Car(String registeredNumber, VehicleType vehicleType, Owner owner, int power, int yearsOld, int monthOld, int kmRun, String brand, String model, int rating) {
        super(registeredNumber, vehicleType, owner, power, yearsOld, monthOld, kmRun, brand, model, rating);
    }
}
