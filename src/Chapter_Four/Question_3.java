package Chapter_Four;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter any integer number between 0 and 35: ");
        number = input.nextInt();

        if (number >= 10 && number <= 35) System.out.println((char) ('A' + (number - 10)));
        else if (number <= 9 && number >= 0) System.out.println(number);
        else System.out.println("Out of range!");


    }
}
