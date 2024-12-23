package Chapter_Three;

import java.util.Scanner;

public class Question_Two {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double number;

        System.out.print("Enter a decimal number: ");
        number = console.nextDouble();
        System.out.println();

        System.out.printf("The entered number is : %.2f", number);
    }
}
