package Chapter_Two;
import java.util.Scanner;

public class Question_Ten {
    static  Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double num1, num2, num3, num4, num5, average;
        int intNum1, intNum2, intNum3, intNum4, intNum5, sum;

        System.out.println("Enter five decimal numbers: ");
        num1 = console.nextDouble();
        num2 = console.nextDouble();
        num3 = console.nextDouble();
        num4 = console.nextDouble();
        num5 = console.nextDouble();

        System.out.print("The entered numbers are " + num1 + ", " + num2 + ", ");
        System.out.println(num3 + ", " + num4 + " and " + num5);

        intNum1 = (int) Math.round(num1);
        intNum2 = (int) Math.round(num2);
        intNum3 = (int) Math.round(num3);
        intNum4 = (int) Math.round(num4);
        intNum5 = (int) Math.round(num5);

        sum = (intNum1 + intNum2 + intNum3 + intNum4 + intNum5);
        average = (double) sum / 5;

        System.out.println("The sum of the entered numbers is " + sum + " and their average is " + average);
    }
}
