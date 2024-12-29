package Chapter_Four;

import java.util.Scanner;

public class Question_10 {
    static Scanner console = new Scanner(System.in);
    static int TOTAL_WEEKS = 5;
    static double INCOME_TAX = 0.14;

    public static void main(String[] args) {
        double income_before_tax, income_after_tax, payRate, hoursWorked,
                clothes_and_accessories, school_supplies, saving_bonds_percentage,
                saving_bonds, total_addit_savings;

        System.out.print("Enter the pay rate for an hour: ");
        payRate = console.nextDouble();

        System.out.print("Enter the amount of hours worked each week: ");
        hoursWorked = console.nextDouble();

        System.out.print("Enter the percentage(%) of money spent on saving bonds: ");
        saving_bonds_percentage = console.nextDouble() / 100;
        System.out.println();

        income_before_tax = payRate * hoursWorked * TOTAL_WEEKS;
        income_after_tax = income_before_tax - (income_before_tax * INCOME_TAX);

        System.out.println("Your income before tax is $" + income_before_tax);
        System.out.println("Your income after tax is $" + income_after_tax);

        clothes_and_accessories = income_after_tax * 0.10;
        school_supplies = income_after_tax * 0.01;

        System.out.println("The money spent on clothes and accessories is $" + clothes_and_accessories);
        System.out.println("The money spent on school supplies is $" + school_supplies);

        // Update form Question 18 in Chapter Two
        if (saving_bonds_percentage == 0) {
            saving_bonds = 0;
            total_addit_savings = (income_after_tax - (clothes_and_accessories + school_supplies)) * 0.01;
            System.out.println("The money spent to buy saving bonds is $" + saving_bonds);
            System.out.println("Additional saving bonds money from your parents is $" + total_addit_savings);
        }
        else if (saving_bonds_percentage<= 0.25 && saving_bonds_percentage > 0){
            saving_bonds = (income_after_tax - (clothes_and_accessories + school_supplies)) * saving_bonds_percentage;
            total_addit_savings = (saving_bonds * 0.25) +
                    ((income_after_tax - (clothes_and_accessories + school_supplies)) * 0.01);
            System.out.println("The money spent to buy saving bonds is $" + saving_bonds);
            System.out.println("Additional saving bonds money from your parents is $" + total_addit_savings);
        }
        else if (saving_bonds_percentage > 0.25) {
            saving_bonds = (income_after_tax - (clothes_and_accessories + school_supplies)) * saving_bonds_percentage;
            total_addit_savings = (saving_bonds * 0.40) +
                    ((income_after_tax - (clothes_and_accessories + school_supplies)) * 0.02);
            System.out.println("The money spent to buy saving bonds is $" + saving_bonds);
            System.out.println("Additional saving bonds money from your parents is $" + total_addit_savings);
        }
        else System.out.println("Unexpected value: " + saving_bonds_percentage);
        System.out.println();
    }
}
