package atmSystemDesign.atmState;

import atmSystemDesign.Card;
import atmSystemDesign.Currency;
import atmSystemDesign.TransactionOptions;

import java.util.Iterator;
import java.util.Map;

public abstract class ATMState {
    void insertCashInAtm(Currency Cash, int quantity){
        System.out.println("Ops, Something Wrong happen");
    }
    void insertCardInAtm(Card card){
        System.out.println("Ops, Something Wrong happen");
    }
    void insertPin(String pin){
        System.out.println("Ops, Something Wrong happen");
    }
    void selectOption(TransactionOptions option){
        System.out.println("Ops, Something Wrong happen");
    }
    void withdrawCashAmount(int Amount){
        System.out.println("Ops, Something Wrong happen");
    }
    void checkBalance(){
        System.out.println("Ops, Something Wrong happen");
    }
    void changePin(int pin){
        System.out.println("Ops, Something Wrong happen");
    }
    void exit(){
        System.out.println("Ops, Something Wrong happen");
    }
}
