package atmSystemDesign;

public class Card {
    private String cardNum;
    private int cvv;
    private String expDate;

    private String pinNum;

    private BankAccount userBankAcc;

    Card(){}
    Card(String cardNum, int cvv, String expDate, String pinNum, BankAccount userBankAcc){
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expDate = expDate;
        this.pinNum = pinNum;
        this.userBankAcc = userBankAcc;
    }

    public void deductMoney(int money, String pinNum){
        if(!pinNum.equals(this.pinNum)){
            System.out.println("Invalid Pin");
        }
        if(userBankAcc.deductMoney(money)){
            System.out.println("Money " + money + " has been deducted from " + userBankAcc.getAccountHolderName() + "'s Account successfully");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }


    public void setCardValues(String cardNum, int cvv, String expDate, String pinNum, BankAccount userBankAcc){
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expDate = expDate;
        this.pinNum = pinNum;
        this.userBankAcc = userBankAcc;
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
    public void setPinNum(String pinNum) {
        this.pinNum = pinNum;
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
