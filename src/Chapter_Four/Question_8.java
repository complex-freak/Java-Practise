package Chapter_Four;  // This solution is applicable for question 9 also

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        char operation;
        double num1, num2, sum, difference, multiple, dividend;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = console.nextDouble();
        System.out.print("Enter the operation to be performed(+, -, *, /): ");
        operation = console.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = console.nextDouble();
        System.out.println();

        switch (operation) {
            case '+':
                sum = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, sum);
                break;

            case '-':
                difference = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, difference);
                break;

            case '*':
                multiple = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, multiple);
                break;

            case '/':
                if (num2 == 0){
                    System.out.println("DivisionError: Can not divide by 0!");
                    break;
                }
                dividend = num1 / num2;
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, dividend);
                break;

            default:
                System.out.println("Unexpected operation: " + operation);
        }
    }
}
