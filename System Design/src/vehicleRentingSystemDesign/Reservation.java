package vehicleRentingSystemDesign;

import vehicleRentingSystemDesign.types.ReservationStatus;
import vehicleRentingSystemDesign.user.User;
import vehicleRentingSystemDesign.vehicle.Vehicle;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {
    Store store;
    Vehicle vehicle;
    User customer;
    ReservationStatus reservationStatus;
    LocalDateTime reservationStartTime;
    LocalDateTime reservationEndTime;
    Bill bill;

    public Reservation(Store store, Vehicle vehicle, User customer, LocalDateTime reservationStartTime, LocalDateTime reservationEndTime) {
        this.store = store;
        this.vehicle = vehicle;
        this.customer = customer;
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
    }

    public Bill generateBill(){
        if(bill == null){
            this.bill = new Bill(this);
        }
        return bill;
    }

    public Store getStore() {
        return store;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public User getCustomer() {
        return customer;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public LocalDateTime getReservationStartTime() {
        return reservationStartTime;
    }

    public LocalDateTime getReservationEndTime() {
        return reservationEndTime;
    }

    public Bill getBill() {
        return bill;
    }


}
