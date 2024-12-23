package Chapter_Two;
import java.util.Scanner;

public class Question_Fifteen {
    static Scanner console = new Scanner(System.in);
    static double PI = 3.141593;

    public static void main(String[] args) {
        double a, b, c, radius;
        System.out.println("Enter the sides of the triangle a, b, and c: ");
        a = console.nextDouble();
        b = console.nextDouble();
        c = console.nextDouble();

        radius = (a + b + c) / 2 * PI;

        System.out.println("The radius of the circle is " + radius);
    }
}
