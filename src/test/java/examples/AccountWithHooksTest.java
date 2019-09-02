package examples;

import answers.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountWithHooksTest {

    private Account account;

    @Before
    public void createNewAccount() {

        account = new Account(1000);
    }

    @Test
    public void withdraw500FromAccount_shouldBeAllowed() throws Exception {

        // Act - withdraw 500
        account.withdraw(500);

        // Assert - check that the remaining balance is 500
        Assert.assertEquals(500, account.getBalance());
    }

    @Test
    public void deposit500ToAccount_shouldResultInCorrectBalance() {

        // Act - deposit 500
        account.deposit(500);

        // Assert - check that the new balance is 1500
        Assert.assertEquals(1500, account.getBalance());
    }

    @Test(expected=Exception.class)
    public void withdraw1100FromAccount_shouldThrowException() throws Exception{

        // Act - try to withdraw 1100
        account.withdraw(1100);
    }
}
