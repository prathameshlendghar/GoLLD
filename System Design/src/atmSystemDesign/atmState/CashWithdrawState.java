package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Card;
import atmSystemDesign.cashWithdrawChainProcessor.*;

public class CashWithdrawState extends ATMState{
    public CashWithdrawState(){
        System.out.println("Enter the Amount to Withdraw");
    }

    @Override
    public void withdrawCashAmount(ATM atm, Card card, int amount){
        CashWithdrawHandler cashWithdrawHandler = new CashWithdrawHandler(new TwoKWithdrawHandler(new FiveHundredWithdrawHandler(new TwoHundredWithdrawHandler(new FiftyWithdrawHandler(new DefaultCheckHandler(null))))));
        if(card.getCardBalance() < amount){
            System.out.println("InSufficient Balance in your Bank Account");
            exit(atm);
            return;
        }
        if(atm.checkAvailableMoney() < amount){
            System.out.println("ATM has insufficient Money, Sorry for Inconvenience");
            exit(atm);
            return;
        }
        if(cashWithdrawHandler.withdraw(atm, amount)){
            boolean isDeducted = card.deductMoney(amount);
            exit(atm);
        }else{
            System.out.println("ATM is unable to dispence this specific amount");
            exit(atm);
            return;
        }
    }
}
