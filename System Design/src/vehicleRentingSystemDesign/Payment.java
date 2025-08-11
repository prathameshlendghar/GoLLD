package vehicleRentingSystemDesign;

public class Payment {
    Bill bill;
    Reservation Reservation;

    Payment(Bill bill){
        this.bill = bill;
    }

    public void payBill(){
        System.out.println(bill.getTotalCost() + "Rs payment successful");
    }
}
