package atmSystemDesign;

import atmSystemDesign.atmState.ATMState;
import atmSystemDesign.atmState.IdleState;

import java.util.Map;

public class ATM {
    private Map<Currency, Integer> cashInAtm;
    public ATMState atmState;
    public static final ATM atmObj = new ATM();
    public Card card;

    public static ATM getATMObj(){
        return atmObj;
    }

    private ATM(){
        atmState = new IdleState();
    }

    public void changeATMState(ATMState atmState){
        this.atmState = atmState;
    }

    public void addCash(Currency currency, int quantity){
        int cash = cashInAtm.getOrDefault(currency, 0)+quantity;
        cashInAtm.put(currency, cash);
    }

    public void addCash(Map<Currency, Integer> cashInAtm){
        this.cashInAtm = cashInAtm;
    }

    public boolean checkCashAvailable(Currency currency, int quantity){
        int cash = cashInAtm.getOrDefault(currency, 0);
        return cash >= quantity;
    }

    public boolean dispenseCash(Currency currency, int quantity){
        if(checkCashAvailable(currency, quantity)){
            int cash = cashInAtm.get(currency) - quantity;
            cashInAtm.put(currency, cash);
            return true;
        }
        else{
            return false;
        }
    }

    void insertCashInAtm(Currency cash, int quantity){
        atmState.insertCashInAtm(this, cash, quantity);
    }
    void insertCardInAtm(Card card){
        atmState.insertCardInAtm(this, card);
    }
    void insertPin(String pin){
        atmState.insertPin(this, card, pin);
    }
    void selectOption(TransactionOptions option){
        atmState.selectOption(this, card, option);
    }
    void withdrawCashAmount(int amount){
        atmState.withdrawCashAmount(this, card, amount);
    }
    void checkBalance(){
        atmState.checkBalance(this, card);
    }
    void changePin(String pin){
        atmState.changePin(this, card, pin);
    }
    void exit(){
        atmState.exit(this);
    }

}
