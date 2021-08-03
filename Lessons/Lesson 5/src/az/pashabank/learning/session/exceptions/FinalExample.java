package az.pashabank.learning.session.exceptions;

class InvalidAmountException extends RuntimeException {
    public  InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private int balance = 0;

    public void topUp(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount can not be less or equal to zero!");
        }

        System.out.println("Before top-up " + balance);
        balance =+ amount;
        System.out.println("After top-up " + balance);
    }

    public void withdraw(int amount)  {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount can not be less or equal to zero!");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Balance is insufficient to make this withdraw!");
        }

        System.out.println("Before withdraw " + balance);
        balance -= amount;
        System.out.println("After withdraw " + balance);
    }
}

public class FinalExample {

    public static void main(String[] args) {

        Account account = new Account();
        account.topUp(150);
        account.withdraw(120);
//        account.withdraw(50);
//        account.topUp(-50);
        account.withdraw(-20);
    }
}
