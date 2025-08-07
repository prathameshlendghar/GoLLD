package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Card;
import atmSystemDesign.TransactionOptions;

public class SelectOperationState extends ATMState{
    SelectOperationState(){
        System.out.println("Select Cash Withdraw or Non-Cash Withdraw option");
    }
    @Override
    public void selectOption(ATM atm, Card card, TransactionOptions options){
        switch(options){
            case CHANGEPIN, CHECKBALACE -> atm.changeATMState(new NonCashWithdrawState());
            case DEBITMONEY -> atm.changeATMState(new CashWithdrawState());
            default -> exit(atm);
        }
    }
}
