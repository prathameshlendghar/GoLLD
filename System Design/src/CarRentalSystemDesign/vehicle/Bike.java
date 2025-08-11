package CarRentalSystemDesign.vehicle;

import CarRentalSystemDesign.types.VehicleType;
import CarRentalSystemDesign.user.Owner;

public class Bike extends Vehicle{

    public Bike(String registeredNumber, VehicleType vehicleType, Owner owner, int power, int yearsOld, int monthOld, int kmRun, String brand, String model, int rating) {
        super(registeredNumber, vehicleType, owner, power, yearsOld, monthOld, kmRun, brand, model,rating);
    }
}
