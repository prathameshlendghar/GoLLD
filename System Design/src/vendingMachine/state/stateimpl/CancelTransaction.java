package vendingMachine.state.stateimpl;

import vendingMachine.Coin;
import vendingMachine.ItemOnShelf;
import vendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class CancelTransaction {

    List<Coin> coins;

    CancelTransaction(List<Coin> coins){
        this.coins = coins;
    }

    public void pressInsertCoinButton(VendingMachine vendingMachine){
        System.out.println("Transaction Cancellation Stage. Cannot insert Coin");
    }
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Transaction Cancellation Stage. Cannot insert Coin");
    }
    public void pressProductSelectionButton(VendingMachine vendingMachine) {
        System.out.println("Transaction Cancellation Stage. Cannot Select products");
    }
    public void chooseProduct(VendingMachine VendingMachine, Integer productCode) {
        System.out.println("Transaction Cancellation Stage. Cannot choose Coin");
    }
    public List<Coin> cancelAndGetRefundButton(VendingMachine vendingMachine) {
        System.out.println("Transaction Cancelled Successfully");
        vendingMachine.changeState(new IdleState());
        return coins;
    }
    public List<Coin> dispenseProductAndGetChange(VendingMachine vendingmachine) {
        System.out.println("Transaction Cancellation in process, Cannot Dispense Product");
        return null;
    }
    public void updateInventory(VendingMachine vendingMachine, List<ItemOnShelf> lis) {

    }
}
