package atmSystemDesign.atmState;

import atmSystemDesign.ATM;
import atmSystemDesign.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCardInAtm(ATM atm, Card card){
        if(!card.validCard()){
            System.out.println("Card credentials are invalid");
            return;
        }
        atm.card = card;
        System.out.println("Card inserted Successfully");
        atm.changeATMState(new HasCardState());
    }
}
