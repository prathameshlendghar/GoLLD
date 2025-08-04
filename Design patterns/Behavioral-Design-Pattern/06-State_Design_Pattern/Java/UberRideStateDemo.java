// interface UberRideState{
//     public void handleRideBooking(Ride ride);
//     public void handleRideCancelation(Ride ride);
//     public void handleCompleteRide(Ride ride);
// }

// class RideBookingState implements UberRideState{
//     @Override
//     public void handleRideBooking(Ride ride){
//         System.out.println("Your Ride is in Booking State...");
//         ride.setState(new DriverAssigningState());
//     }

//     @Override
//     public void handleRideCancelation(Ride ride){
//         System.out.println("Cannot Cancel the Request: No Ride Booked Yet...");
//     }

//     @Override
//     public void handleCompleteRide(Ride ride){
//         System.err.println("Cannot finish/Complete the ride before Starting");
//     }
// }

// class DriverAssigningState implements UberRideState{
//     DriverAssigningState(){
//         System.err.println("Assigning Rider in Progress...");
//     }

//     @Override
//     public void handleRideBooking(Ride ride){
//         System.err.println("Existing Ride: Assigning Rider in Progress...");
//     }

//     @Override
//     public void handleRideCancelation(Ride ride){
//         System.out.println("Cancel Ride Successful");
//         ride.setState(new RideBookingState());
//     }

//     @Override
//     public void handleCompleteRide(Ride ride){
//         System.err.println("Cannot finish/Complete the ride before Starting");
//     }
// }

// class DriverAssignedState implements UberRideState{
//     public DriverAssignedState(){
//         System.err.println("Assigned Rider Successfully");
//     }

//     @Override
//     public void handleRideBooking(Ride ride){
//         System.err.println("Existing Ride: Rider Assigned...");
//     }

//     @Override
//     public void handleRideCancelation(Ride ride){
//         System.out.println("Cancel Ride Successful");
//         ride.setState(new RideBookingState());
//     }

//     @Override
//     public void handleCompleteRide(Ride ride){
//         System.err.println("Cannot finish/Complete the ride before Starting");
//     }
// }

// class EnRouteState implements UberRideState{
//     public EnRouteState(){
//         System.err.println("Ride Started: Have a safe Ride...");
//     }

//     @Override
//     public void handleRideBooking(Ride ride){
//         System.err.println("Existing Ride: You are in Ongoing ride...");
//     }

//     @Override
//     public void handleRideCancelation(Ride ride){
//         System.out.println("Existing Ride: You are in Ongoing ride...");
//     }

//     @Override
//     public void handleCompleteRide(Ride ride){
//         System.out.println("Thanks for booking ride with us.");
//         ride.setState(new RideBookingState());
//     }
// }


// class Ride{
//     UberRideState state;
//     public Ride(){
//         state = new RideBookingState();
//     }

//     public void setState(UberRideState state){
//         this.state = state;
//     }

//     public void bookRide(){
//         state.handleRideBooking(this);
//     }

//     public void cancelRide(){
//         state.handleRideCancelation(this);
//     }

//     public void completeRide(){
//         state.handleCompleteRide(this);
//     }
// }

// public class UberRideStateDemo{
//     public static void main(String[] args) {
//         Ride ride = new Ride();
//         ride.bookRide();

//         UberRideState state = new DriverAssignedState();
//         ride.setState(state);

//         UberRideState state1 = new EnRouteState();
//         ride.setState(state1);

//         ride.completeRide();
//     }
// }


// Interface defining the state behavior
interface UberRideState {
    void handleRequestRide(Ride ride);
    void handleAssignDriver(Ride ride);
    void handleStartRide(Ride ride);
    void handleCancelRide(Ride ride);
    void handleCompleteRide(Ride ride);
}

// RideBookingState – Initial state
class RideBookingState implements UberRideState {
    @Override
    public void handleRequestRide(Ride ride) {
        System.out.println("Your ride is being booked...");
        ride.setState(new DriverAssigningState());
    }

    @Override
    public void handleAssignDriver(Ride ride) {
        System.out.println("Cannot assign driver: Ride not requested yet.");
    }

    @Override
    public void handleStartRide(Ride ride) {
        System.out.println("Cannot start ride: No driver assigned.");
    }

    @Override
    public void handleCancelRide(Ride ride) {
        System.out.println("Nothing to cancel: No ride requested.");
    }

    @Override
    public void handleCompleteRide(Ride ride) {
        System.out.println("Cannot complete ride: Ride hasn't started.");
    }
}

// DriverAssigningState
class DriverAssigningState implements UberRideState {
    public DriverAssigningState() {
        System.out.println("Assigning driver...");
    }

    @Override
    public void handleRequestRide(Ride ride) {
        System.out.println("Ride is already in the process of being assigned a driver.");
    }

    @Override
    public void handleAssignDriver(Ride ride) {
        System.out.println("Driver assigned successfully.");
        ride.setState(new DriverAssignedState());
    }

    @Override
    public void handleStartRide(Ride ride) {
        System.out.println("Cannot start: Driver not yet assigned.");
    }

    @Override
    public void handleCancelRide(Ride ride) {
        System.out.println("Ride canceled during driver assignment.");
        ride.setState(new RideBookingState());
    }

    @Override
    public void handleCompleteRide(Ride ride) {
        System.out.println("Cannot complete ride: Ride hasn't started.");
    }
}

// DriverAssignedState
class DriverAssignedState implements UberRideState {
    public DriverAssignedState() {
        System.out.println("Driver is on the way!");
    }

    @Override
    public void handleRequestRide(Ride ride) {
        System.out.println("Ride is already booked and driver is assigned.");
    }

    @Override
    public void handleAssignDriver(Ride ride) {
        System.out.println("Driver is already assigned.");
    }

    @Override
    public void handleStartRide(Ride ride) {
        System.out.println("Ride started. Enjoy your trip!");
        ride.setState(new EnRouteState());
    }

    @Override
    public void handleCancelRide(Ride ride) {
        System.out.println("Ride canceled. We hope to see you again.");
        ride.setState(new RideBookingState());
    }

    @Override
    public void handleCompleteRide(Ride ride) {
        System.out.println("Cannot complete: Ride hasn’t started yet.");
    }
}

// EnRouteState
class EnRouteState implements UberRideState {
    public EnRouteState() {
        System.out.println("Ride is in progress...");
    }

    @Override
    public void handleRequestRide(Ride ride) {
        System.out.println("You're already on a ride.");
    }

    @Override
    public void handleAssignDriver(Ride ride) {
        System.out.println("Driver is already with you.");
    }

    @Override
    public void handleStartRide(Ride ride) {
        System.out.println("Ride already started.");
    }

    @Override
    public void handleCancelRide(Ride ride) {
        System.out.println("Cannot cancel: Ride is already in progress.");
    }

    @Override
    public void handleCompleteRide(Ride ride) {
        System.out.println("Thank you for riding with us. Ride completed.");
        ride.setState(new RideBookingState());
    }
}

// Context class: Ride
class Ride {
    private UberRideState state;

    public Ride() {
        this.state = new RideBookingState();
    }

    public void setState(UberRideState state) {
        this.state = state;
    }

    public void requestRide() {
        state.handleRequestRide(this);
    }

    public void assignDriver() {
        state.handleAssignDriver(this);
    }

    public void startRide() {
        state.handleStartRide(this);
    }

    public void cancelRide() {
        state.handleCancelRide(this);
    }

    public void completeRide() {
        state.handleCompleteRide(this);
    }
}

// Demo class
public class UberRideStateDemo {
    public static void main(String[] args) {
        Ride ride = new Ride();

        ride.requestRide();     // Booking requested
        ride.assignDriver();    // Driver assigned
        ride.startRide();       // Ride started
        ride.completeRide();    // Ride completed

        System.out.println("\n--- Try canceling after new booking ---");
        ride.requestRide();
        ride.cancelRide();
    }
}
