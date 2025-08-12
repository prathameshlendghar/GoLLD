package vehicleRentingSystemDesign.pricingStrategy;

import vehicleRentingSystemDesign.vehicle.Vehicle;

public class HourlyPricingStrategy implements PricingStrategy{

    @Override
    public float calculatePricingStrategy(Vehicle vehicle, long hours){
        float pricePerDay = vehicle.getOneDayPrice();
        float priceOfHour = pricePerDay/(float)24.0;

        return priceOfHour*hours;
    }
}
