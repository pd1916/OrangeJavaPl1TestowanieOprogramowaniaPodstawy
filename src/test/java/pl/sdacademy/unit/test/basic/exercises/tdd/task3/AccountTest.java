package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private static final Customer CUSTOMER_1 = new Customer("Jan", "Kowalski");
    private static final Customer CUSTOMER_2 = new Customer("Ala", "Nowak");
    /*
    1. happy path: credit i debit są poprawne
    2. negative path: zły numer konta dla credit account
    3. negative path: zły numer konta dla debit account
    4. negative path: przelew większy niż ilość środków na koncie
    5. negative path: przelew na kwotę mniejszą bądź równą zero
     */

    @Test
    void shouldTransferMoneyForCorrectAmount() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", CUSTOMER_1);
        Account debit = new Account(2000, "22222222222222222222222222", CUSTOMER_2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1100, credit.getBalance());
        assertEquals(1900, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfCreditAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, "111111111111111111111111111", CUSTOMER_1);
        Account debit = new Account(2000, "22222222222222222222222222", CUSTOMER_2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfDebitAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", CUSTOMER_1);
        Account debit = new Account(2000, "222222222222222222222222222", CUSTOMER_2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfAmountIsHigherThanBalance() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", CUSTOMER_1);
        Account debit = new Account(2000, "22222222222222222222222222", CUSTOMER_2);
        //when
        debit.transferMoney(credit, 5000);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfAmountIsLessZero() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", CUSTOMER_1);
        Account debit = new Account(2000, "22222222222222222222222222", CUSTOMER_2);
        //when
        debit.transferMoney(credit, -100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfAmountIsEqualToZero() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", CUSTOMER_1);
        Account debit = new Account(2000, "22222222222222222222222222", CUSTOMER_2);
        //when
        debit.transferMoney(credit, 0);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

}