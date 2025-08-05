package vendingMachine;

import java.util.*;

public class Inventory {
    List<ItemOnShelf> inventory;
    int shelfCodeStart = 101;
    int numberOfShelf = 20;

    Inventory(){
        inventory = new ArrayList<>(numberOfShelf);
    }

    Inventory(List<ItemOnShelf> inventory){
        if(numberOfShelf < inventory.size()){
            System.err.println("You are Trying to insert more Items. Capacity if shelf on Machine is " + numberOfShelf);
            return;
        }
        this.inventory = inventory;
    }

    public boolean isInvalidShelfCode(int shelfCode){
        return shelfCode < shelfCodeStart || shelfCode > (shelfCodeStart + numberOfShelf);
    }

    public void addItemOnShelf(int shelfCode, int quantity){
        if(isInvalidShelfCode(shelfCode)){
            System.err.println("Shelf Code should be between " + shelfCodeStart + " and " + shelfCodeStart+numberOfShelf);
            return;
        }
        ItemOnShelf itemOnShelf = inventory.get(shelfCode - shelfCodeStart);
        itemOnShelf.addItemInventory(quantity);
    }

    public void sellItem(int shelfCode){
        if(isInvalidShelfCode(shelfCode)){
            System.err.println("Shelf Code should be between " + shelfCodeStart + " and " + shelfCodeStart+numberOfShelf);
            return;
        }
        inventory.get(shelfCode - shelfCodeStart).sell();
    }

    public void putNewItemOnShelf(ItemOnShelf item, int shelfCode){
        if(isInvalidShelfCode(shelfCode)){
            System.err.println("Shelf Code should be between " + shelfCodeStart + " and " + shelfCodeStart+numberOfShelf);
            return;
        }

        if(inventory.get(shelfCode - shelfCodeStart) == null){
            inventory.set(shelfCode - shelfCodeStart,item);
        }else{
            System.err.println("The Shelf is occupied with some other Item Already try to replace it");
        }
    }

    public void replaceItemOnShelf(ItemOnShelf item, int shelfCode){

        if(isInvalidShelfCode(shelfCode)){
            System.err.println("Shelf Code should be between " + shelfCodeStart + " and " + shelfCodeStart+numberOfShelf);
            return;
        }

        inventory.set(shelfCode - shelfCodeStart, item);
    }

    public void updateInventory(List<ItemOnShelf> inventory){
        if(numberOfShelf < inventory.size()){
            System.err.println("You are Trying to insert more Items. Capacity if shelf on Machine is " + numberOfShelf);
            return;
        }
        this.inventory = inventory;
    }
}
