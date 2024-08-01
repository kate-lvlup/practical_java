package jom.com.softserve.s1.task7;

class InsufficientAmountException extends Exception {
    private double amount;

    public InsufficientAmountException(double amount) {
        super("Sorry, but you are short $" + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientAmountException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientAmountException(needs);
        }
    }
}
