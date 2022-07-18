package OOP.BankAccount;

public class Account {
    private int balance;
    private String firstName;
    private String lastName;
    private String accountNumber;
    private String pin;
    private int BVN;
    private String fullName = firstName + " " + lastName;
    public Account(String firstName, String lastName, String accountNumber, int BVN){
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.BVN = BVN;
        this.pin = pin;
    }

    public double viewBalance(){
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance = balance + amount;
        }
        throw new MyBankExceptions("You can't deposit negative value");
    }

    public void withdraw(int amount){
        if (amount <= balance){
            balance -= amount;
        }
        throw  new MyBankExceptions("You are unable to withdraw " + amount + "because it exceeds your account balance");
    }

    public String getCustomerFullName(){
        return fullName;
    }

    public String getCustomerAccountNumber(){
        return accountNumber;
    }
    public int getCustomerBVN(){
        return BVN;
    }

    @Override
    public String toString() {
        return String.format("""
                Account Name: %s
                Account Number: %s
                """, getCustomerFullName(), getCustomerAccountNumber());
    }


}
