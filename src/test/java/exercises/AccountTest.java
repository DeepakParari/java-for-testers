package exercises;

import org.junit.*;

public class AccountTest {

    @Test
    public void withdraw500FromAccount_shouldBeAllowed() throws Exception {

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - withdraw 500
        account.withdraw(500);

        // Assert - check that the remaining balance is 500
        // TODO: add an assertion that checks whether the remaining balance is equal to 500
    }

    @Test
    public void deposit500ToAccount_shouldResultInCorrectBalance() {

        // Arrange - create a new account with a balance of 1000
        // TODO: create a new instance of the Account class with a balance of 1000

        // Act - deposit 500
        // TODO: add a call to the deposit() method to deposit 500

        // Assert - check that the new balance is 1500
        // TODO: add an assertion to check that the new balance is equal to 1500
    }

    @Test
    public void withdraw1100FromAccount_shouldThrowException() throws Exception {

        // Arrange - create a new account with a balance of 1000
        Account account = new Account(1000);

        // Act - try to withdraw 1100
        account.withdraw(1100);

        // TODO: this test method throws an Exception. However, that's expected behavior, so the test should pass.. What to do?
    }
}
