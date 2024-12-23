package Chapter_Three;

import java.util.Scanner;
import java.io.*;

public class Question_One {
    static double PI = 3.1416;

    public static void main(String[] args) throws FileNotFoundException {
        // declare reference variables
        Scanner inFile = null;
        PrintWriter outFile = null;

        // Open and associate files
        inFile = new Scanner(new FileReader("inData.txt"));
        outFile = new PrintWriter("outData.txt");

        double length, width, radius, interestRate, rectangleArea, circleArea, perimeter,
                circumference, initialBalance, monthlyInterest, finalBalance;
        int age;
        String firstname, lastname;
        char initialChar, nextChar;

        length = inFile.nextDouble();
        width = inFile.nextDouble();
        radius = inFile.nextDouble();

        firstname = inFile.next();
        lastname = inFile.next();
        age = inFile.nextInt();

        initialBalance = inFile.nextDouble();
        interestRate = inFile.nextDouble();

        initialChar = inFile.next().charAt(0);

        // Rectangle calculations
        rectangleArea = width * length;
        perimeter = (width + length) * 2;

        // Circle calculations
        circleArea = PI * radius * radius;
        circumference = 2 * PI * radius;

        //  Monthly interest  = balance * (rate /100) / 12
        monthlyInterest = initialBalance * ( interestRate / 100 ) / 12;
        finalBalance = initialBalance + monthlyInterest;

        // Next character
        nextChar = (char) (initialChar + 1);

        outFile.println("Rectangle: ");
        outFile.println(String.format("Length = %.2f, width = %.2f, area = %.2f, perimeter = %.2f",
                length, width, rectangleArea, perimeter));
        outFile.println();

        outFile.println("Circle: ");
        outFile.println(String.format("Radius = %.2f, area = %.2f, circumference = %.2f",
                radius, circleArea, circumference));
        outFile.println();

        outFile.println(String.format("Name: %s %s, age: %d", firstname, lastname, age));
        outFile.println(String.format("Beginning balance = $%.2f, interest rate = $%.2f",
                initialBalance, interestRate));
        outFile.println(String.format("Balance at the end of the month = $%.2f", finalBalance));
        outFile.println();

        outFile.println(String.format("The character that comes after %s in the ASCII is %s",
                initialChar, nextChar));

        inFile.close();
        outFile.close();

    }

}
