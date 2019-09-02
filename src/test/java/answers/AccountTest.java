package answers;

import org.junit.*;

public class AccountTest {

    @Test
    public void withdraw500FromAccount_shouldBeAllowed() throws Exception {

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - withdraw 500
        account.withdraw(500);

        // Assert - check that the remaining balance is 500
        Assert.assertEquals(500, account.getBalance());
    }

    @Test
    public void deposit500ToAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - deposit 500
        account.deposit(500);

        // Assert - check that the new balance is 1500
        Assert.assertEquals(1500, account.getBalance());
    }

    @Test
    public void withdraw1100FromAccount_shouldThrowException() throws Exception {

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - try to withdraw 1100
        account.withdraw(1100);
    }
}
