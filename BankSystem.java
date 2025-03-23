class Account {
    int AccountNo;
    int balance;
    Account(int AccountNo, int balance) { // Constructor
        this.AccountNo = AccountNo;
        this.balance = balance;
    }
}
class SavingsAccount extends Account {
    double interestRate;
    SavingsAccount(int AccountNo, int balance, double interestRate) {
        super(AccountNo, balance);
        this.interestRate = interestRate;
    }
    double calculateInterest() {
        return balance * (interestRate / 100);
    }
}
class CurrentAccount extends Account {
    double overDraftLimit;
    CurrentAccount(int AccountNo, int balance, double overDraftLimit) {
        super(AccountNo, balance);
        this.overDraftLimit = overDraftLimit;
    }
    void displayLimit() {
        System.out.println("Overdraft Limit: " + overDraftLimit);
    }
}
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(1001, 5000, 5);
        System.out.println("Account " + s1.AccountNo + ": Balance = " + s1.balance);
        System.out.println("Interest: " + s1.calculateInterest());
        CurrentAccount c1 = new CurrentAccount(1002, 3000, 1000);
        System.out.println("Account " + c1.AccountNo + ": Balance = " + c1.balance);
        c1.displayLimit();
    }
}