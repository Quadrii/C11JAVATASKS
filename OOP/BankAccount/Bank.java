package OOP.BankAccount;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    ArrayList<TheBankAccount> accounts = new ArrayList<>();
    ArrayList <Customer> customers = new ArrayList<>();

    public ArrayList<TheBankAccount> getAccounts(){
        return accounts;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
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

    public TheBankAccount getAccount(String accountNumber){
        for (TheBankAccount account : accounts){
            if(Objects.equals(account.getCustomerAccountNumber(), accountNumber)){
                return account;
            }
        }
        throw new MyBankExceptions("Account does not exist");
    }

    public void createAccount(String firstName, String lastName, String accountNumber, int BVN, String password){
        TheBankAccount account = new TheBankAccount(firstName, lastName, accountNumber, BVN, password);
        accounts.add(account);
    }

    public double getAccountBalance(String  accountNumber, String  password){
        for (TheBankAccount account : accounts){
            if (Objects.equals(account.getCustomerAccountNumber(), account)){
                if (Objects.equals(account.getPassword(), password)){
                    return account.viewBalance();
                }
            }
        }
        throw new MyBankExceptions("Incorrect pin/account number");
    }

    public void deposit(double amount, String  accountNumber){
        for (TheBankAccount account : accounts){
            if (Objects.equals(account.getCustomerAccountNumber(), accountNumber)){
                account.deposit(amount);
            }
        }
    }

    public void closeAccount(String accountNumber, String password){
        for (TheBankAccount account : accounts){
            if (Objects.equals(account.getCustomerAccountNumber(), accountNumber)){
                if (Objects.equals(account.getPassword(), password)){
                    accounts.remove(account);
                }
            }
            System.out.println("Account closed successfully");
        }
        throw new MyBankExceptions("Account does not exist");
    }

    public void withdraw(double amount, String password, String accountNumber){
        for (TheBankAccount account : accounts){
            if (Objects.equals(account.getCustomerAccountNumber(), accountNumber)){
                if (Objects.equals(account.getPassword(), password)){
                    account.withdraw(amount);
                }
            }
        }
    }

    public void transfer(String accountToTransferTo, String accountToTransferFrom, double amountToTransfer){
        TheBankAccount sender = null;
        TheBankAccount receiver = null;
        for (TheBankAccount account : accounts){
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
