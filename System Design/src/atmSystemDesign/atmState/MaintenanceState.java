package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Currency;

public class MaintenanceState extends ATMState{
    public MaintenanceState(){
        System.out.println("ATM in Maintenance State");
    }

    @Override
    public void insertCashInAtm(ATM atm, Currency cash, int quantity) {
        atm.addCash(cash,quantity);
        System.out.println("ATM accepted " + quantity + " number of cash " + cash.getValue() + " notes. Continue inserting or Exit the Maintenance state");
    }
}
