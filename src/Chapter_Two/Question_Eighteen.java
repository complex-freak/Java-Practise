package Chapter_Two;
import java.util.Scanner;

public class Question_Eighteen {
    static Scanner console = new Scanner(System.in);
    static int TOTAL_WEEKS = 5;
    static double INCOME_TAX = 0.14;
    static double ADDITIONAL_SAVINGS_PER_DOLLAR = 0.50;

    public static void main(String[] args) {
        double income_before_tax, income_after_tax, payRate, hoursWorked,
                clothes_and_accessories, school_supplies, saving_bonds, total_addit_savings;

        System.out.print("Enter the pay rate for an hour: ");
        payRate = console.nextDouble();

        System.out.print("Enter the amount of hours worked each week: ");
        hoursWorked = console.nextDouble();
        System.out.println();

        income_before_tax = payRate * hoursWorked * TOTAL_WEEKS;
        income_after_tax = income_before_tax - (income_before_tax * INCOME_TAX);

        System.out.println("Your income before tax is $" + income_before_tax);
        System.out.println("Your income after tax is $" + income_after_tax);

        clothes_and_accessories = income_after_tax * 0.10;
        school_supplies = income_after_tax * 0.01;

        System.out.println("The money spent on clothes and accessories is $" + clothes_and_accessories);
        System.out.println("The money spent on school supplies is $" + school_supplies);

        saving_bonds = (income_after_tax - (clothes_and_accessories + school_supplies)) * 0.25;
        total_addit_savings = saving_bonds * ADDITIONAL_SAVINGS_PER_DOLLAR;

        System.out.println("THe money spent to buy saving bonds is $" + saving_bonds);
        System.out.println("Additional saving bonds money from your parents is $" + total_addit_savings);
        System.out.println();
    }
}
