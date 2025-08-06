package atmSystemDesign;

public class ATMRoom {
    public static void main(String[] args){
        BankAccount account = new BankAccount("John", "123456789", 3000);
        Card card = new Card("1234234534564567", 433, "03/29", "1234", account);
        User user = new User(card);

        ATM atmMachine = ATM.getATMObj();

        atmMachine.insertCardInAtm(card);
        atmMachine.insertPin("12375");
        atmMachine.selectOption(TransactionOptions.CHECKBALACE);
        atmMachine.checkBalance();
//        atmMachine.selectOption(TransactionOptions.CHANGEPIN);
    }
}
