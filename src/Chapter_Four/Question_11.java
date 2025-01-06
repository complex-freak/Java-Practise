package Chapter_Four;

import java.util.Scanner;

public class Question_11 {
    final static double SERVICE_CHARGE_SAVINGS = 10.00;
    final static double SERVICE_CHARGE_CHECKING = 25.00;
    final static double INTEREST_SAVINGS = 0.04;
    final static double INTEREST_CHECKING = 0.05;
    final static double INTEREST_CHECKING_OVER_5000 = 0.03;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int account_number;
        char account_type;
        double min_balance, current_balance;

        System.out.print("Enter account number: ");
        account_number = console.nextInt();
        System.out.print("Enter account type(S or s for Savings account and C or c for checking account: ");
        account_type = console.next().toUpperCase().charAt(0);
        System.out.print("Enter the minimum balance to be maintained: ");
        min_balance = console.nextDouble();
        System.out.print("Enter the current balance: ");
        current_balance = console.nextDouble();
        System.out.println();

        System.out.println("Account number: " + account_number);


        if (account_type == 'S') {

            System.out.println("Account type: Savings Account");
            if (current_balance < min_balance) {
                current_balance -= SERVICE_CHARGE_SAVINGS;

            }
            else {
                current_balance = current_balance + (current_balance * INTEREST_SAVINGS);

            }

            System.out.printf("Current balance is $%.2f%n", current_balance);
        }
        else if (account_type == 'C') {

            System.out.println("Account type: Checking Account");
            if (current_balance < min_balance) {
                current_balance -= SERVICE_CHARGE_CHECKING;
            }
            else if (current_balance - min_balance >= 5000) {
                current_balance = current_balance + (current_balance * INTEREST_CHECKING_OVER_5000);
            }
            else current_balance = current_balance + (current_balance * INTEREST_CHECKING);

            System.out.printf("Current balance is $%.2f%n", current_balance);
        }
        else System.out.println("Invalid account type: " + account_type);
    }
}
