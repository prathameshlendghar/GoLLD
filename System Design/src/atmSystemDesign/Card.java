package atmSystemDesign;

public class Card {
    private String cardNum;
    private int cvv;
    private String expDate;

    private String pinNum;

    private BankAccount userBankAcc;

    Card(){}
    Card(String cardNum, int cvv, String expDate, BankAccount userBankAcc){
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expDate = expDate;
        this.userBankAcc = userBankAcc;
    }

    public boolean deductMoney(int money){
        return userBankAcc.deductMoney(money);
    }

    public void setCardValues(String cardNum, int cvv, String expDate, BankAccount userBankAcc){
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expDate = expDate;
        this.userBankAcc = userBankAcc;
    }

    public boolean validatePin(String pin){
        return pin.equals(this.pinNum);
    }

    public boolean validCard(){
        return this.getCardNum().length() == 16 && this.getCvv()>=100;
    }

    public int getCardBalance(){
        return this.userBankAcc.getAccountBalance();
    }

    public void setCardNum(String cardNum){
        this.cardNum = cardNum;
    }
    public void setCvv(int cvv){
        this.cvv = cvv;
    }
    public void setExpDate(String expDate){
        this.expDate = expDate;
    }
    public boolean setPinNum(String pinNum) {
        if(pinNum.length() != 4){
            return false;
        }
        this.pinNum = pinNum;
        return true;
    }
    public void setUserBankAcc(BankAccount bankAcc){
        this.userBankAcc = bankAcc;
    }

    public String getCardNum() {
        return cardNum;
    }
    public int getCvv() {
        return cvv;
    }
    public String getExpDate() {
        return expDate;
    }
    public BankAccount getUserBankAcc() {
        return userBankAcc;
    }

}
