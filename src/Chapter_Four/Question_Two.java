package Chapter_Four;

import java.util.Scanner;

public class Question_Two {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter three numbers: ");
        num1 = console.nextInt();
        num2 = console.nextInt();
        num3 = console.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.printf("Numbers in non-descending order: %d, %d, %d", num1, num2, num3);
    }
}
