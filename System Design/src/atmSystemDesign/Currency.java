package atmSystemDesign;

public enum Currency {
    TWOTHOUSAND(2000),
    FIVEHUNDRED(500),
    TWOHUNDRED(200),
    ONEHUNDRED(100),
    FIFTY(50);

    private final int value;

    Currency(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
