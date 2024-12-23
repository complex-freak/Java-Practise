package Chapter_Three;

import java.util.Scanner;

public class Question_Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tempDegreesFahrenheit, tempDegreeCelsius;

        System.out.print("Enter temperature given in degree Fahrenheit: ");
        tempDegreesFahrenheit = input.nextDouble();
        System.out.println();

        tempDegreeCelsius = (5.0 / 9.0) * (tempDegreesFahrenheit - 32);
        System.out.println("Temperate in: ");
        System.out.printf("Degree Fahrenheit: %.2f%n", tempDegreesFahrenheit);
        System.out.printf("Degree Celsius: %.2f%n", tempDegreeCelsius);


    }
}
