package Chapter_Four;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sideA, sideB, sideC, hypotenuse, leg1, leg2;

        System.out.print("Enter the dimensions of the sides(a, b, c) of a triangle: ");
        sideA = console.nextDouble();
        sideB = console.nextDouble();
        sideC = console.nextDouble();

        if (sideA > sideB && sideA > sideC) {
            hypotenuse = sideA;
            leg1 = sideB;
            leg2 = sideC;
        } else if (sideB > sideA && sideB > sideC) {
            hypotenuse = sideB;
            leg1 = sideA;
            leg2 = sideC;
        } else {
            hypotenuse = sideC;
            leg1 = sideB;
            leg2 = sideA;
        }

        if (Math.pow(hypotenuse, 2) == Math.pow(leg1, 2) + Math.pow(leg2, 2))
            System.out.println("The triangle is a right triangle");
        else System.out.println("The triangle is NOT a right triangle");
    }
}
