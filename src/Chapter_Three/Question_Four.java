package Chapter_Three;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Question_Four {
    static Scanner console = new Scanner(System.in);
    static final double TAXABLE_PERCENTAGE = .92;
    static final double TAX_RATE_PER_100 = 1.05;

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter("assessedValue.txt");
        double assessedValue, taxableAmount, propertyTax;

        System.out.print("Enter the assessed value of the property: ");
        assessedValue = console.nextDouble();

        taxableAmount = assessedValue * TAXABLE_PERCENTAGE;
        propertyTax = (taxableAmount / 100) * TAX_RATE_PER_100;

        outFile.printf("Assessed Value: $%.2f%n", assessedValue);
        outFile.printf("Taxable Amount: $%.2f%n", taxableAmount);
        outFile.printf("Tax Rate for Each $ 100.00: $%.2f%n", TAX_RATE_PER_100);
        outFile.printf("Property Tax: $%.2f%n", propertyTax);

        outFile.close();
    }
}
