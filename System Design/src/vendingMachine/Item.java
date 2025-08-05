package vendingMachine;

public class Item {
    ItemType type;
    String name;
    int price;

    Item(String name, ItemType type, int price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setItemType(ItemType type){
        this.type = type;
    }

    public void getPrice(){
        System.out.println(this.price);
    }

    public void getType(){
        System.out.println(this.type);
    }

    public void getName(){
        System.out.println(this.name);
    }
}
