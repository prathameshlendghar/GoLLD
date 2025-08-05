package vendingMachine.state.stateimpl;

import vendingMachine.Coin;
import vendingMachine.ItemOnShelf;
import vendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class DispenceProductAndChangeState {
    int productCode;
    List<Coin> coins;

    DispenceProductAndChangeState(List<Coin> coins, int productCode){
        this.coins = coins;
        this.productCode = productCode;
        System.out.println("Your Product " + productCode + " dispense is in progress...");
    }
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("Product Dispense in progress, Cannot Insert coin");
    }
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Product Dispense in progress, Cannot Insert coin");
    }
    public void pressProductSelectionButton(VendingMachine vendingMachine) {
        System.out.println("Product Dispense in progress, Cannot Select Product");
    }
    public void chooseProduct(VendingMachine VendingMachine, Integer productCode) {
        System.out.println("Product Dispense in progress, Cannot choose Product");
    }
    public List<Coin> cancelAndGetRefundButton(VendingMachine vendingMachine) {
        System.out.println("Cannot Refund at Product Dispense Stage");
        return null;
    }
    public List<Coin> dispenseProductAndGetChange(VendingMachine vendingmachine) {
        System.out.println("Dispensed Product " + productCode + " is Successfully Dispatched");
        vendingmachine.changeState(new IdleState());
        return coins;
    }

    public void updateInventory(VendingMachine vendingMachine, List<ItemOnShelf> lis) {

    }
}
