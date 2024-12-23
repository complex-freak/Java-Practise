package Chapter_Two;
import java.util.Scanner;

public class Question_Seven {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double length, width, perimeter, area;

        System.out.println("Enter the length of a rectangle: ");
        length = console.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = console.nextDouble();

        perimeter =2 * (length + width);
        area = length * width;

        System.out.print("The length of the rectangle is " + length + ", its width is " + width);
        System.out.println(", its area is " + area + " and its perimeter is " + perimeter);
    }
}
