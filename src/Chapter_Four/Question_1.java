package Chapter_Four;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number;
        System.out.print("Enter any integer number: ");
        number = console.nextInt();
        System.out.println();

        if (number > 0) System.out.printf("Number %d is positive", number);
        else if (number < 0) System.out.printf("Number %d is negative", number);
        else System.out.printf("Number %d is zero", number);
    }
}
