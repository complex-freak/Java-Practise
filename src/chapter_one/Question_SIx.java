package chapter_one;
import java.util.Scanner;

public class Question_SIx {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double number;
        System.out.println("Enter any decimal number: ");
        number = console.nextDouble();

        System.out.println("The enter number to its nearest integer is " + (int) Math.round(number));
    }

}
