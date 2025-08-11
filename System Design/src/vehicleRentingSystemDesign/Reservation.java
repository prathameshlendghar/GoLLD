package vehicleRentingSystemDesign;

import vehicleRentingSystemDesign.types.ReservationStatus;
import vehicleRentingSystemDesign.user.User;
import vehicleRentingSystemDesign.vehicle.Vehicle;

public class Reservation {
    Store store;
    Vehicle vehicle;
    User owner;
    User customer;
    ReservationStatus reservationStatus;

    Reservation(Store store){
        this.store = store;
    }

    Reservation(){}

    public void payBill(){
        
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }


}
