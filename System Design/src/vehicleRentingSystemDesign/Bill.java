package vehicleRentingSystemDesign;

import vehicleRentingSystemDesign.pricingStrategy.DailyPricingStrategy;
import vehicleRentingSystemDesign.pricingStrategy.HourlyPricingStrategy;
import vehicleRentingSystemDesign.pricingStrategy.Pricing;
import vehicleRentingSystemDesign.types.DurationIn;
import vehicleRentingSystemDesign.vehicle.Vehicle;

import java.time.Duration;
import java.time.Period;

public class Bill {
    Vehicle vehicle;
    DurationIn durationIn;
    long duration;
    float totalCost;
    Reservation reservation;

    private Bill(Reservation reservation) {
        this.reservation = reservation;
        calculateTime();
        calculateCost();
    }

    public void calculateTime(){
        Duration duration = Duration.between(reservation.getReservationStartTime(), reservation.getReservationEndTime());
        long days = duration.toDays();
        long hours = duration.toHours();
        if(days > 0){
            durationIn = DurationIn.DAY;
            this.duration = days;
        }
        if(hours > 0){
            if(durationIn == DurationIn.DAY){
                this.duration++;
            }
            else{
                this.durationIn = DurationIn.HOUR;
                this.duration = hours;
            }
        }
    }

    private void calculateCost(){
        Pricing pricing = new Pricing(durationIn);
        this.totalCost = pricing.calculatePricingStrategy(vehicle, this.duration);
    }

    public float getTotalCost() {
        return totalCost;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public DurationIn getDurationIn() {
        return durationIn;
    }

    public long getDuration() {
        return duration;
    }

    public Reservation getReservation() {
        return reservation;
    }
}
