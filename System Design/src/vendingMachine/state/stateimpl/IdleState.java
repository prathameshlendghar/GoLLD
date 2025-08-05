package vendingMachine.state.stateimpl;

import vendingMachine.Coin;
import vendingMachine.ItemOnShelf;
import vendingMachine.VendingMachine;
import vendingMachine.state.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{
    IdleState(){
        System.out.println("Vending Machine is in idle state");
    }

    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("You can insert coins now...");
        vendingMachine.changeState(new CoinInsertState());
    }
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Machine in Idle state. Please press Coin Insert button first");
    }
    public void pressProductSelectionButton(VendingMachine vendingMachine) {
        System.out.println("Product Selection button is inactive in Idle state: Press Enter Coin");
    }
    public void chooseProduct(VendingMachine VendingMachine, Integer productCode) {
        System.out.println("Product Selection button is inactive in Idle state: Press Enter Coin");
    }
    public List<Coin> cancelAndGetRefundButton(VendingMachine vendingMachine) {
        System.out.println("Nothing to cancel. Machine in Idle State");
        return null;
    }
    public List<Coin> dispenseProductAndGetChange(VendingMachine vendingmachine) {
        System.out.println("Nothing selected to dispense: Machine in Idle State");
        return null;
    }
    public void updateInventory(VendingMachine vendingMachine, List<ItemOnShelf> lis) {

    }

}
