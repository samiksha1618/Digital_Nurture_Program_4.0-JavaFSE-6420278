package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000);
        System.out.println("Setting up BankAccount with balance 1000");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down BankAccount");
    }

    @Test
    void testWithdraw() {
        account.withdraw(100);
        assertEquals(900, account.getBalance());
    }

    @Test
    void testWithdrawTooMuch() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-500);
        });
        assertEquals("Cannot deposit non-positive amount", exception.getMessage());
    }

    @Test
    void testDeposit() {
        account.deposit(200);
        assertEquals(1200, account.getBalance());
    }
}
