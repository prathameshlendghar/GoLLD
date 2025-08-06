package atmSystemDesign;

public class User {
    private Card card;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public Card getCard() {
        return card;
    }

    private BankAccount bankAccount;

    public void setCard(Card card){
        this.card = card;
    }
    public void setBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
}
