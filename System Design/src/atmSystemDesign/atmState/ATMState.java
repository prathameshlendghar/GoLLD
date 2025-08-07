package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Card;
import atmSystemDesign.Currency;
import atmSystemDesign.TransactionOptions;

import java.util.Iterator;
import java.util.Map;

public abstract class ATMState {
    public void maintenanceATM(ATM atm){
        System.out.println("Ops, Something Wrong happen");
    }
    public void insertCashInAtm(ATM atm, Currency Cash, int quantity){
        System.out.println("Ops, Something Wrong happen");
    }
    public void insertCardInAtm(ATM atm, Card card){
        System.out.println("Ops, Something Wrong happen");
    }
    public void insertPin(ATM atm, Card card, String pin){
        System.out.println("Ops, Something Wrong happen");
    }
    public void selectOption(ATM atm, Card card, TransactionOptions option){
        System.out.println("Ops, Something Wrong happen");
    }
    public void withdrawCashAmount(ATM atm, Card card, int Amount){
        System.out.println("Ops, Something Wrong happen");
    }
    public void checkBalance(ATM atm, Card card){
        System.out.println("Ops, Something Wrong happen");
    }
    public void changePin(ATM atm, Card card, String pin){
        System.out.println("Ops, Something Wrong happen");
    }
    public void exit(ATM atm){
        atm.changeATMState(new IdleState());
    }
}
