package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Card;

public class NonCashWithdrawState extends ATMState{
    public NonCashWithdrawState(){
        System.out.println("Please select any Non-cash Withdraw options");
    }

    @Override
    public void changePin(ATM atm, Card card, String pin){
        if(!card.setPinNum(pin)){
            System.out.println("Unable to set Pin");
            exit(atm);
            return;
        }
        System.out.println("Pin set Successfully");
        atm.changeATMState(new IdleState());
    }

    @Override
    public void checkBalance(ATM atm, Card card){
        System.out.println(card.getUserBankAcc().getAccountBalance());
        atm.changeATMState(new IdleState());
    }
}
