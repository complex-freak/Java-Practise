package chapter_one;
import java.util.Scanner;

public class Question_Eleven {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String number;
        System.out.println("Enter four-digit positive integer: ");
        number = console.nextLine();

        System.out.println(number.charAt(0));
        System.out.println(number.charAt(1));
        System.out.println(number.charAt(2));
        System.out.println(number.charAt(3));
    }
}
