package chapter_one;
import java.util.Scanner;

public class Question_Nine {
    static  Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double num1, num2, num3, num4, num5, sum;

        System.out.println("Enter five decimal numbers: ");
        num1 = console.nextDouble();
        num2 = console.nextDouble();
        num3 = console.nextDouble();
        num4 = console.nextDouble();
        num5 = console.nextDouble();

        sum = (num1 + num2 + num3 + num4 + num5);
        System.out.println("The sum of the entered numbers is " + (int) Math.round(sum));
    }
}
