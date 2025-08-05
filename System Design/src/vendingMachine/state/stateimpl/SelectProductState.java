package vendingMachine.state.stateimpl;

import vendingMachine.Coin;
import vendingMachine.ItemOnShelf;
import vendingMachine.VendingMachine;
import vendingMachine.state.State;

import java.util.ArrayList;
import java.util.List;

public class SelectProductState implements State {
    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("In Process. Please enter product code to dispense or cancel the transaction");
    }
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Please do not insert the coin. Please enter product code to dispense or cancel the transaction");
    }
    public void pressProductSelectionButton(VendingMachine vendingMachine) {
        System.out.println("Please Select the Product to Dispense");
    }
    public void chooseProduct(VendingMachine vendingMachine, Integer productCode) {
        if(vendingMachine.isInvalidateProductCode(productCode)) {
            return;
        }


    }
    public List<Coin> cancelAndGetRefundButton(VendingMachine vendingMachine) {
        return new ArrayList<>();
    }
    public List<Coin> dispenseProductAndGetChange(VendingMachine vendingmachine) {
        return new ArrayList<>();
    }
    public void updateInventory(VendingMachine vendingMachine, List<ItemOnShelf> lis) {

    }
}
