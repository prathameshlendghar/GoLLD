package vendingMachine;

public class ItemOnShelf {
    Item item;
    int shelfCode;
    int quantity;
    int capacity = 10;

    ItemOnShelf(Item item, int shelfCode, int quantity){
        this.item = item;
        this.shelfCode = shelfCode;
        this.quantity = quantity;
    }

    public boolean isSoldOut(){
        return quantity == 0;
    }

    public void addItemInventory(int quantity){
        if(this.quantity + quantity > capacity){
            int product = quantity-capacity;
            System.out.println("Can Take only " + product  + " Items");
            this.quantity = capacity;
        }
        else{
            System.out.println("Inserted all Items successfully");
            this.quantity += quantity;
        }
    }

    public Item getItem(){
        return item;
    }

    public int getQuantity(){
        return quantity;
    }

    public void sell(){
        if(quantity == 0){
            System.out.println("Sold Out");
            return;
        }
        quantity--;
    }

    public void replaceItemOnShelf(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    public void replaceItemOnShelf(int quantity){
        this.quantity = quantity;
    }

}
