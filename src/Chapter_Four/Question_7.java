package Chapter_Four;

import java.util.Scanner;

public class Question_7 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;

        System.out.print("Enter the x-y coordinate of a point in a Cartesian plane: ");
        x = Integer.parseInt(console.next());
        y = Integer.parseInt(console.next());
        System.out.println();

        if (x == 0 && y == 0)
            System.out.printf("(%d, %d) is the origin.%n", x, y);
        else if (y == 0)
            System.out.printf("(%d, %d) is on the x-axis.%n", x, y);
        else if (x == 0)
            System.out.printf("(%d, %d) is on the y-axis.%n", x, y);
        else if (x > 0 && y > 0)
            System.out.printf("(%d, %d) is in the first quadrant.%n", x, y);
        else if (x < 0 && y > 0)
            System.out.printf("(%d, %d) is in the second quadrant.%n", x, y);
        else if (x < 0 && y < 0)
            System.out.printf("(%d, %d) is in the third quadrant.%n", x, y);
        else if (x > 0 && y < 0)
            System.out.printf("(%d, %d) is in the fourth quadrant.%n", x, y);
        else System.out.println("Invalid entry");
    }
}
