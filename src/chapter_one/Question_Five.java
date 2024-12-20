package chapter_one;
import java.util.Scanner;

public class Question_Five {
    static Scanner console = new Scanner(System.in);
    static final int SECRET = 11;
    static final double RATE = 12.50;

    public static void main(String[] args) {
        int num1, num2, newNum;
        double hoursWorked, wages;
        String name;

        System.out.println("Enter two numbers(integers): ");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println("the value of num1 is " + num1 + " and the value of num2 is " + num2);

        newNum = (num1 * 2) + num2;
        System.out.println("The value of newNum is " + newNum);

        newNum += SECRET;
        System.out.println("THe updated value of newNum is " + newNum);

        System.out.println("Enter a person last name: ");
        name = console.next();
        System.out.println("Enter a decimal number between 0 and 70: ");
        hoursWorked = console.nextDouble();

        wages = hoursWorked * RATE;

        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);
    }
}
