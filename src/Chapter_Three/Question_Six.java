package Chapter_Three;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Question_Six {
    static final double FEDERAL_INCOME_TAX = .15;
    static final double STATE_TAX = .035;
    static final double SOCIAL_SECURITY_TAX = .0575;
    static final double MEDICAID_TAX = .0275;
    static final double PENSION_PLAN = 75.00;
    static final double HEALTH_INSURANCE = .05;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        PrintWriter output = new PrintWriter("EmployeeMonthlyPayCheck.txt");

        double grossAmount, federalTax, stateTax, socialSecurityTax, medicaidTax,
                healthInsurance, netPay;
        String name;

        System.out.print("Enter the name of the employee: ");
        name = console.nextLine();
        System.out.print("Enter the employee gross amount: ");
        grossAmount = console.nextDouble();
        System.out.println();

        federalTax = grossAmount * FEDERAL_INCOME_TAX;
        stateTax = grossAmount * STATE_TAX;
        socialSecurityTax = grossAmount * SOCIAL_SECURITY_TAX;
        medicaidTax = grossAmount * MEDICAID_TAX;
        healthInsurance = grossAmount * HEALTH_INSURANCE;

        netPay = grossAmount - federalTax - stateTax - socialSecurityTax - medicaidTax - healthInsurance - PENSION_PLAN;

        output.println(name);
        output.printf("Gross Amount: $ %.2f%n", grossAmount);
        output.printf("Federal Tax: $ %.2f%n", federalTax);
        output.printf("State Tax: $ %.2f%n", stateTax);
        output.printf("Social Security: $ %.2f%n", socialSecurityTax);
        output.printf("Medicare/Medicaid Tax: $ %.2f%n", medicaidTax);
        output.printf("Pension Plan: $ %.2f%n", PENSION_PLAN);
        output.printf("Health Insurance: $ %.2f%n", healthInsurance);
        output.printf("Net Pay: $ %.2f%n", netPay);

        output.close();
    }

}
