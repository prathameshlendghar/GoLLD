package vehicleRentingSystemDesign.pricingStrategy;

import vehicleRentingSystemDesign.types.DurationIn;
import vehicleRentingSystemDesign.vehicle.Vehicle;

public class Pricing {
    PricingStrategy pricingStrategy;

    public Pricing(DurationIn durationIn){
        if(durationIn == DurationIn.DAY){
            pricingStrategy = new DailyPricingStrategy();
        }else if(durationIn == DurationIn.HOUR){
            pricingStrategy = new DailyPricingStrategy();
        }
    }

    public float calculatePricingStrategy(Vehicle vehicle, long duration){
        return pricingStrategy.calculatePricingStrategy(vehicle, duration);
    }
}
