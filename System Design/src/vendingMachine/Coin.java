package vendingMachine;

public enum Coin {
    ONE(1),
    FIVE(5),
    TEN(10),
    FIFTY(50),
    HUNDRED(100);

    final int value;

    Coin(int val){
        this.value = val;
    }

    int getValue(){
        return this.value;
    }
}
