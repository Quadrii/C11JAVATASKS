public class CreditLimitCalculator {
   private int accountNumber;
    private int balanceAtTheBeginning;
    private int totalCharged;
    private int creditLimitAllowed;


    public void setAccountNumber(){
        this.accountNumber = accountNumber;
    }
    public void setBalanceAtTheBeginning(){
        this.balanceAtTheBeginning = balanceAtTheBeginning;
    }
    public void setTotalCharged(){
        this.totalCharged = totalCharged;
    }
    public void setCreditLimitAllowed(){
        this.creditLimitAllowed = creditLimitAllowed;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalanceAtTheBeginning(){
        return balanceAtTheBeginning;
    }

    public int getTotalCharged(){
        return totalCharged;
    }
    public int getCreditLimitAllowed(){
        return creditLimitAllowed;
    }
    
    public int getNewBalance(){
        return getBalanceAtTheBeginning() + getTotalCharged() - getCreditLimitAllowed();
    }

    public boolean creditExceeded(){
        return (getNewBalance() > getCreditLimitAllowed()) ? false : true;
    }


}
