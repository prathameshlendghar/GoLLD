package atmSystemDesign.cashWithdrawChainProcessor;

import atmSystemDesign.ATM;
import atmSystemDesign.Currency;

import java.util.Map;

public class FiftyWithdrawHandler extends CashWithdrawHandler{
    public FiftyWithdrawHandler(CashWithdrawHandler nextCashWithdrawChain){
        super(nextCashWithdrawChain);
    }

    @Override
    public boolean withdraw(ATM atm, Integer amount){
        Map<Currency, Integer> availableCashInAtm = atm.getCashAvailableDetails();
        Currency currency = Currency.FIFTY;
        int currencyAmount = currency.getValue();
        int numberOfNotes = Integer.min(availableCashInAtm.get(currency), amount / currencyAmount);

        int tempAmount = amount - currencyAmount*numberOfNotes;
        boolean result = nextCashWithdrawChain.withdraw(atm, tempAmount);
        if(result){
            atm.dispenseCash(currency, numberOfNotes);
//            System.out.println("Dispensed "+numberOfNotes+" Notes of " + currencyAmount + "Rs");
            return true;
        }else{
            return false;
        }
    }
}
