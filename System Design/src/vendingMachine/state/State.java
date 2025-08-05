package vendingMachine.state;

import vendingMachine.Coin;
import vendingMachine.ItemOnShelf;
import vendingMachine.VendingMachine;

import java.util.List;

public interface State{
    public void pressInsertCoinButton(VendingMachine vendingMachine);
    public void insertCoin(VendingMachine vendingMachine, Coin coin);
    public void pressProductSelectionButton(VendingMachine vendingMachine);
    public void chooseProduct(VendingMachine VendingMachine, Integer productCode);
    public List<Coin> cancelAndGetRefundButton(VendingMachine vendingMachine);
    public List<Coin> dispenseProductAndGetChange(VendingMachine vendingmachine);
    public void updateInventory(VendingMachine vendingMachine, List<ItemOnShelf> lis);
}
