public class BankAccount { // Private elements
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
    public double Deposit(double amount) { // Function for Deposit
        return this.balance += amount;
    }

    public double Withdraw(double amount) { // Function for Withdraw
        if (this.balance >= amount + 5) {
            this.balance -= amount + 5;
        } else {
            System.out.println("Insufficient funds"); // If it´s not possible do the withdraw
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
