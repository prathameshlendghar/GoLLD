package atmSystemDesign.cashWithdrawChainProcessor;

import atmSystemDesign.ATM;

public class CashWithdrawHandler {
    CashWithdrawHandler nextCashWithdrawChain;
    public CashWithdrawHandler(CashWithdrawHandler nextCashWithdrawChain){
        this.nextCashWithdrawChain = nextCashWithdrawChain;
    }

    public boolean withdraw(ATM atm, Integer amount){
        return nextCashWithdrawChain.withdraw(atm, amount);
    }
}
