package vendingMachine.state.stateimpl;

import vendingMachine.Coin;
import vendingMachine.ItemOnShelf;
import vendingMachine.VendingMachine;
import vendingMachine.state.State;

import java.util.ArrayList;
import java.util.List;

public class CoinInsertState implements State {
    List<Coin> coins = null;

    CoinInsertState(){
        System.out.println("You can insert coins now");
    }

    public void pressInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("Please Insert the coin Now");
    }
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        if(this.coins == null){
            coins = new ArrayList<>();
        }
        coins.addLast(coin);
    }

    public void pressProductSelectionButton(VendingMachine vendingMachine) {
        if(coins == null){
            System.out.println("Please Insert the coins first");
            return;
        }
        vendingMachine.changeState(new SelectProductState());
    }

    public void chooseProduct(VendingMachine VendingMachine, Integer productCode) {
        System.out.println("Press the Product Selection Button First");
    }

    public List<Coin> cancelAndGetRefundButton(VendingMachine vendingMachine) {
        System.out.println("Transaction Cancellation Successful. Please collect the refund");
        vendingMachine.changeState(new IdleState());
        return coins;
    }

    public List<Coin> dispenseProductAndGetChange(VendingMachine vendingmachine) {
        System.out.println("Product Not selected: Click on Product Selection Button");
        return null;
    }
    
    public void updateInventory(VendingMachine vendingMachine, List<ItemOnShelf> lis) {

    }
}
