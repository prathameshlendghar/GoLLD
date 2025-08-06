package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Card;

public class HasCardState extends ATMState{
    @Override
    public void insertPin(ATM atm, Card card, String pin){
        if(card.validatePin(pin)){
            System.out.println("Invalid Card pin");
            return;
        }
        atm.changeATMState(new SelectOperationState());
        System.out.println("Valid Card Pin");
    }

    @Override
    public void exit(ATM atm){
        atm.changeATMState(new IdleState());
    }
}
