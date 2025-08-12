package vehicleRentingSystemDesign.pricingStrategy;

import vehicleRentingSystemDesign.vehicle.Vehicle;

public class DailyPricingStrategy implements PricingStrategy{


    @Override
    public float calculatePricingStrategy(Vehicle vehicle, long days){
        float pricePerDay = vehicle.getOneDayPrice();
        return pricePerDay*days;
    }
}
