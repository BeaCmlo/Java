import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");

        BankAccount bankAccount; // Inicialize constructor

        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit amount: ");
            double deposit = sc.nextDouble();
            bankAccount = new BankAccount(account, holder, deposit); // Pass the paramethers (as like deposit)
            bankAccount.Deposit(deposit);
        }
        else if (response == 'n') {
            bankAccount = new BankAccount(account, holder); // Pass the paramethers for another constructor

        }else{ System.out.println("Invalid input");
        sc.close();
        return;
        }
        System.out.println();

        System.out.print("Account data: ");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a deposit data: ");
        double deposit = sc.nextDouble();
        bankAccount.Deposit(deposit);

        System.out.print("Updated account data: ");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        sc.nextLine();
        bankAccount.Withdraw(withdraw);

        System.out.print("Uptaded account data: ");
        System.out.println(bankAccount);

        sc.close();
    }
}