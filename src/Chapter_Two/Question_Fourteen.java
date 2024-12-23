package Chapter_Two;
import java.util.Scanner;

public class Question_Fourteen {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double original_price_item, markedUp_percentage, sales_taxRate;
        System.out.print("Enter original price of the item : ");
        original_price_item = console.nextDouble();

        System.out.print("Enter the marked-up percentage: ");
        markedUp_percentage = console.nextDouble();

        System.out.print("Enter the sales tax rate: ");
        sales_taxRate = console.nextDouble();
        System.out.println();

        System.out.println("The original price of the item $" + original_price_item);
        System.out.println("the marked-up percentage is " + markedUp_percentage + "%");
        System.out.println("The sales tax-rate is " + sales_taxRate + "%");

        double sellingPrice, sales_tax, finalSellingPrice;
        sellingPrice = original_price_item + (original_price_item * markedUp_percentage / 100);
        sales_tax = sellingPrice * sales_taxRate / 100;
        finalSellingPrice = sellingPrice + sales_tax;

        System.out.println("The sales tax is " + sales_tax + "%");
        System.out.println("The store's selling price of an item is $" + sellingPrice);
        System.out.println("The final selling price of an item is $" + finalSellingPrice);
    }
}
