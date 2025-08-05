package vendingMachine;

import vendingMachine.state.*;

import java.util.List;

public class VendingMachine {
    Inventory inventory;
    private State MachineState;

    VendingMachine(Inventory inventory){
        this.inventory = inventory;
    }

    public void pressInsertCoinButton(){
        MachineState.pressInsertCoinButton(this);
    }

    public void insertCoin(Coin coin){
        MachineState.insertCoin(this, coin);
    }

    public void pressProductSelectionButton(){
        MachineState.pressProductSelectionButton(this);
    }

    public void chooseProduct(int productCode){
        MachineState.chooseProduct(this, productCode);
    }

    public List<Coin> cancelAndGetRefundButton(){
        return MachineState.cancelAndGetRefundButton(this);
    }

    public List<Coin> dispenseProductAndGetChange(){
        return MachineState.dispenseProductAndGetChange(this);
    }

    public void changeState(State state){
        this.MachineState = state;
    }

    public boolean isInvalidateProductCode(int productCode){
        return inventory.isInvalidShelfCode(productCode);
    }

//    public void updateInventory(){
//
//    }

//    public void pressInsertCoinButton(VendingMachine vendingMachine);
//    public void insertCoin(VendingMachine vendingMachine, Coin coin);
//    public void pressProductSelectionButton(VendingMachine vendingMachine);
//    public void chooseProduct(VendingMacine vendingMacine, Integer productCode);
//    public List<Coin> cancelAndGetRefundButton(VendingMachine vendingMachine);
//    public List<Coin> dispenceProductAndGetChange(Vendingmachine vendingmachine);
//    public void updateInventory(VendingMachine vendingMachine, List<ItemOnShelf>);
}
