package atmSystemDesign.cashWithdrawChainProcessor;

import atmSystemDesign.ATM;

public class DefaultCheckHandler extends CashWithdrawHandler{
    public DefaultCheckHandler(CashWithdrawHandler nextCashWithdrawChain){
        super(nextCashWithdrawChain);
    }

    @Override
    public boolean withdraw(ATM atm, Integer amount){
        boolean res = amount == 0;
        return amount==0;
    }
}
