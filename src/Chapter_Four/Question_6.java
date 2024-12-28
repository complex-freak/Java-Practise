package Chapter_Four;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a, b, c, root, root1, root2, discriminant;

        System.out.print("Enter the coefficient of x - square: ");
        a = console.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        b = console.nextDouble();
        System.out.print("Enter the constant term: ");
        c = console.nextDouble();
        System.out.println();

        discriminant = Math.pow(b, 2) - (4 * a * c);



        if ( discriminant == 0) {
            System.out.println("The equation has single (repeated) root.");
            root = -b / (2 * a);
            System.out.printf("The root is %.2f%n", root);
        }
        else if ( discriminant > 0) {
            System.out.println("The equation has two real roots");
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are %.2f and %.2f%n", root1, root2);
        }
        else {
            System.out.println("The equation has two complex roots.");
        }

    }
}
