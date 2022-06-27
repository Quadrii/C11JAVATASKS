package OOP.BankAccount;
import java.math.BigDecimal;
public class TheBankAccount {
    private double balance;
    private String firstName;
    private String lastName;
    private String accountNumber;
    private String password;
    private int BVN;
    private String fullName = firstName + " " + lastName;
    public TheBankAccount(String firstName, String lastName, String accountNumber, int BVN, String password){
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.BVN = BVN;
        this.password = password;
    }

    public double viewBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        throw new MyBankExceptions("You can't deposit negative value");
    }

    public void withdraw(double amount){
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
    public String getPassword() {
        return password;
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
