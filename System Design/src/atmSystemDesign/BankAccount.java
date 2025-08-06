package atmSystemDesign;

public class BankAccount {

    private String accountHolderName;
    private int accountBalance;
    private final String accountId;

    BankAccount(String accountHolderName, String accountId, int accountBalance){
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public String getAccountId() {
        return accountId;
    }

    public void changeAccountHolderName(String name){
        this.accountHolderName = name;
    }

    public void creditMoney(int money){
        accountBalance += money;
    }

    public boolean deductMoney(int money){
        if(money <= accountBalance){
            accountBalance-=money;
            return true;
        }
        return false;
    }

}
