package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

public class Account {
    private float balance;
    private String accountNumber;
    private Customer customer;

    private static final int ACCOUNT_NUMBER_LENGTH = 26;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void transferMoney(Account account, float amount) {
        if(isValid(account, amount)) {
            this.setBalance(this.getBalance() - amount);
            account.setBalance(account.getBalance() + amount);
        }
    }

    private boolean isValid(Account account, float amount) {
        return isValidAccountNumber(account)
                && isValidAccountNumber(this)
                && isValidAmount(amount);
    }

    private boolean isValidAmount(float amount) {
        if(this.balance < amount || amount < 0) {
            System.out.println("Wrong amount");
            return false;
        }
        return true;
    }

    private boolean isValidAccountNumber(Account account) {
        if(account.getAccountNumber().length() != ACCOUNT_NUMBER_LENGTH) {
            System.out.println("Wrong account number");
            return false;
        }
        return true;
    }
}