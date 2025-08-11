package vehicleRentingSystemDesign;

import vehicleRentingSystemDesign.pricingStrategy.DailyPricingStrategy;
import vehicleRentingSystemDesign.pricingStrategy.HourlyPricingStrategy;
import vehicleRentingSystemDesign.pricingStrategy.PricingStrategy;
import vehicleRentingSystemDesign.types.DurationIn;
import vehicleRentingSystemDesign.vehicle.Vehicle;

public class Bill {
    Vehicle vehicle;
    DurationIn durationIn;
    int duration;
    float totalCost;
    PricingStrategy pricingStrategy;
    Reservation

    private Bill(Vehicle vehicle, DurationIn durationIn, int duration, float totalCost) {
        this.vehicle = vehicle;
        this.durationIn = durationIn;
        this.duration = duration;
        this.totalCost = totalCost;
    }

    public Bill generateBill(DurationIn durationIn, int duration, Vehicle vehicle){
        if(durationIn == DurationIn.DAY){
            pricingStrategy = new DailyPricingStrategy();
        }else if(durationIn == DurationIn.HOUR){
            pricingStrategy = new HourlyPricingStrategy();
        }

        float totalPrice = pricingStrategy.calculatePricingStrategy(vehicle,duration);

        return new Bill(vehicle,durationIn,duration,totalPrice);
    }

    public float getTotalCost() {
        return totalCost;
    }
}
