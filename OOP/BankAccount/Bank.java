package OOP.BankAccount;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String bankName;
    private String address;
    public Bank(String bankName, String address){
        this.bankName = bankName;
        this.address = address;
    }
    ArrayList<Account> accounts = new ArrayList<>();
    ArrayList <Customer> customers = new ArrayList<>();

    public ArrayList<Account> getAccounts(){
        return accounts;
    }


    public void registerACustomer(String name, Gender gender, int age){
        Customer customer = new Customer(name,age, gender);
        customers.add(customer);
    }

    public Customer getCustomer(int BVN){
        for (Customer customer : customers){
            if(customer.getMyBVN() == BVN){
                return customer;
            }
        }
        throw new MyBankExceptions("Customer does not exist");
    }

    public Account getAccount(String accountNumber){
        for (Account account : accounts){
            if(Objects.equals(account.getCustomerAccountNumber(), accountNumber)){
                return account;
            }
        }
        throw new MyBankExceptions("Account does not exist");
    }

    public void createAccount(String firstName, String lastName, String accountNumber, int BVN){
        Account account = new Account(firstName, lastName, accountNumber, BVN);
        accounts.add(account);
    }

    public double getAccountBalance(String  accountNumber, String  pin){
        for (Account account : accounts){
            return account.viewBalance();
        }
        throw new MyBankExceptions("Incorrect pin/account number");
    }

    public void deposit(int amount, String  accountNumber){
        for (Account account : accounts){
            if (Objects.equals(account.getCustomerAccountNumber(), accountNumber)){
                account.deposit(amount);
            }
        }
    }

    public void closeAccount(String accountNumber, String pin){
        for (Account account : accounts){
            accounts.remove(account);
            System.out.println("Account closed successfully");
        }
        throw new MyBankExceptions("Account does not exist");
    }

    public void withdraw(int amount, String pin, String accountNumber){
        for (Account account : accounts){
            account.withdraw(amount);
        }
    }

    public void transfer(String accountToTransferTo, String accountToTransferFrom, int amountToTransfer){
        Account sender = null;
        Account receiver = null;
        for (Account account : accounts){
            if (Objects.equals(account.getCustomerAccountNumber(), accountToTransferTo)){
                if (Objects.equals(account.getCustomerAccountNumber(), accountToTransferFrom)){
                    sender.withdraw(amountToTransfer);
                    receiver.deposit(amountToTransfer);
                }
            }
        }
        throw  new MyBankExceptions("Account does not exist");
    }
}
