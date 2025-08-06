package atmSystemDesign;

import java.util.Currency;
import java.util.Map;

public class ATM {
    private Map<Currency, Integer> cashInAtm;

    ATM(){}
    ATM(Map<Currency, Integer> cashInAtm){
        this.cashInAtm = cashInAtm;
    }

    public void addCash(Currency currency, int quantity){
        int cash = cashInAtm.getOrDefault(currency, 0)+quantity;
        cashInAtm.put(currency, cash);
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

    public boolean validCard(Card card){
        return card.getCardNum().length() == 16 && card.getCvv()>=100;
    }

}
