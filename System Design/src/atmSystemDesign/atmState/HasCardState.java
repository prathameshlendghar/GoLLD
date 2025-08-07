package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Card;

public class HasCardState extends ATMState{
    public HasCardState(){
        System.out.println("Atm has detected your card. Please enter the pin");
    }
    @Override
    public void insertPin(ATM atm, Card card, String pin){
        if(!card.validatePin(pin)){
            System.out.println("Invalid Card pin");
            exit(atm);
            return;
        }
        System.out.println("Valid Card Pin");
        atm.changeATMState(new SelectOperationState());
    }
}
