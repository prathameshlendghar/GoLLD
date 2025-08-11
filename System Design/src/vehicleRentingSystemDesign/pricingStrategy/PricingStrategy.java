package vehicleRentingSystemDesign.pricingStrategy;

import vehicleRentingSystemDesign.vehicle.Vehicle;

public interface PricingStrategy {
    public float calculatePricingStrategy(Vehicle vehicle, int duration);
}
