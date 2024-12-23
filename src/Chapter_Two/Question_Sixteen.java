package Chapter_Two;
import java.util.Scanner;

public class Question_Sixteen {
    static Scanner console = new Scanner(System.in);
    static double LITERS_PER_CARTON = 3.78;
    static double PRODUCTION_COST_PER_LITER = 0.38;
    static double PROFIT_PER_CARTON = 0.27;

    public static void main(String[] args) {
        double amount_of_milk_produced, production_cost, profit;
        int cartons;

        System.out.print("Enter the total amount of milk produced in the morning: ");
        amount_of_milk_produced = console.nextDouble();

        cartons = (int) Math.floor(amount_of_milk_produced / LITERS_PER_CARTON);
        System.out.println("Number of milk cartons needed to hold milk: " + cartons);

        production_cost = PRODUCTION_COST_PER_LITER * amount_of_milk_produced;
        System.out.println("Production cost of milk is $" + production_cost);

        profit = PROFIT_PER_CARTON * cartons;
        System.out.println("The profit for producing milk is $" + profit);
    }
}
