package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
    @Test
    public void accountCanBeCreatedTest(){
        //given I have created an account
        Account account = new Account();

        // when I check my balance
        int balance = account.getBalance();

        //confirm that my balance is zero
        assertEquals(0, balance);
    }
    @Test
    public void depositMoneyTest(){
        //given I have an account
            Account account1 = new Account();
        //when I deposit money
            account1.deposit(1_500);
        //check that my balance has changed
        assertEquals(1500, account1.getBalance());
    }

    @Test
    public void depositTwiceTest(){
        Account account = new Account();
        account.deposit(1_500);
        account.deposit(2000);

        assertEquals(3_500, account.getBalance());
    }

    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegativeAccountTest(){
        //given that I have an account;
        Account account = new Account();
        //when I deposit negative amount
        account.deposit(-1_500);
        //check that balance has not changed
        assertEquals(0, account.getBalance());
    }

    @Test
    public void withdrawal(){
        Account toluAccount = new Account();
        toluAccount.deposit(3000);
        toluAccount.withdraw(1000);
        assertEquals(2000, toluAccount.getBalance());
    }

    @Test
    public void negativeWithdrawal(){
        Account missAccount = new Account();
        missAccount.deposit(0);
        missAccount.withdraw(-2_000);
        assertEquals(0, missAccount.getBalance());
    }

    @Test
    public void excessWithdrawal(){
        Account excessAccount = new Account();
        excessAccount.deposit(5000);
        excessAccount.withdraw(10_000);
        assertEquals(5000, excessAccount.getBalance());
    }
}
