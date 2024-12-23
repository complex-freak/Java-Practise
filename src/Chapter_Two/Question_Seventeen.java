package Chapter_Two;

import java.util.Scanner;

public class Question_Seventeen {
    static Scanner console = new Scanner(System.in);
    static double LITERS_PER_CARTON = 3.78;

    public static void main(String[] args) {
        double amount_of_milk_produced, production_cost_per_liter, profit_per_carton, production_cost, profit;
        int cartons;

        System.out.print("Enter the total amount of milk produced in the morning: ");
        amount_of_milk_produced = console.nextDouble();

        System.out.print("Enter the cost of producing one liter of milk : ");
        production_cost_per_liter = console.nextDouble();

        System.out.print("Enter the profit on each carton of milk: ");
        profit_per_carton = console.nextDouble();
        System.out.println();

        cartons = (int) Math.floor(amount_of_milk_produced / LITERS_PER_CARTON);
        System.out.println("Number of milk cartons needed to hold milk: " + cartons);

        production_cost = production_cost_per_liter * amount_of_milk_produced;
        System.out.println("Production cost of milk is $" + production_cost);

        profit = profit_per_carton * cartons;
        System.out.println("The profit for producing milk is $" + profit);
    }
}
