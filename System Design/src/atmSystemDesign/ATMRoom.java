package atmSystemDesign;

import java.util.HashMap;
import java.util.Map;

public class ATMRoom {
    public static void main(String[] args){
        BankAccount account = new BankAccount("John", "123456789", 9000);
        Card card = new Card("1234234534564567", 433, "03/29", account);
        card.setPinNum("1234");
        User user = new User(card);

        ATM atmMachine = ATM.getATMObj();

        atmMachine.insertCardInAtm(card);
        atmMachine.insertPin("1234");
        atmMachine.selectOption(TransactionOptions.CHECKBALACE);
        atmMachine.checkBalance();

        System.out.println();
        Map<Currency, Integer> cash = new HashMap<>();
        cash.put(Currency.TWOTHOUSAND, 3);
        cash.put(Currency.FIVEHUNDRED, 12);
        cash.put(Currency.TWOHUNDRED, 1);
        cash.put(Currency.FIFTY, 5);

        atmMachine.addCash(cash);
        atmMachine.insertCardInAtm(card);
        atmMachine.insertPin("1234");
        atmMachine.selectOption(TransactionOptions.DEBITMONEY);
        atmMachine.withdrawCashAmount(6450);
        System.out.println();

        atmMachine.insertCardInAtm(card);
        atmMachine.insertPin("1234");
        atmMachine.selectOption(TransactionOptions.CHANGEPIN);
        atmMachine.changePin("2345");
        System.out.println();

        atmMachine.addCash(cash);
        atmMachine.insertCardInAtm(card);
        atmMachine.insertPin("2345");
        atmMachine.selectOption(TransactionOptions.DEBITMONEY);
        atmMachine.withdrawCashAmount(500);

        atmMachine.maintainATM();
        atmMachine.insertCashInAtm(Currency.TWOHUNDRED, 15);
        System.out.println(atmMachine.getCashAvailableDetails());
    }
}
