public class BankAccount {
    private int accountNumber;
    private String accountTitulare;
    private double deposit;
    private double balance;

    public BankAccount(int accountNumber, String accountTitulare) {
        this.accountNumber = accountNumber;
        this.accountTitulare = accountTitulare;
    }

    public BankAccount(int accountNumber, String accountTitulare, double deposit) {
        this.accountNumber = accountNumber;
        this.accountTitulare = accountTitulare;
        this.deposit = deposit;
    }
    public double Deposit(double amount) {
        return this.balance += amount;
    }

    public double Withdraw(double amount) {
        if (this.balance >= amount + 5) {
            this.balance -= amount + 5;
        } else {
            System.out.println("Insufficient funds");
        }
        return this.balance;
    }


    @Override
    public String toString() {
        return  "Account " + accountNumber +
                ", " + accountTitulare +
                ", Balance: $ " + String.format("%.2f", balance);
    }


}
