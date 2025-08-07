package atmSystemDesign.cashWithdrawChainProcessor;

import atmSystemDesign.ATM;

public class CashWithdrawHandler {
    CashWithdrawHandler nextCashWithdrawChain;
    String s;
    public CashWithdrawHandler(CashWithdrawHandler nextCashWithdrawChain, String s){
        this.nextCashWithdrawChain = nextCashWithdrawChain;
        this.s = s;
    }

    public boolean withdraw(ATM atm, Integer amount){
        return nextCashWithdrawChain.withdraw(atm, amount);
    }
}
