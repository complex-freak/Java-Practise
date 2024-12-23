package Chapter_Two;
import java.util.Scanner;

public class Question_Eight {
    static  Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double test1, test2, test3, test4, test5, average;

        System.out.println("Enter five test scores: ");
        test1 = console.nextDouble();
        test2 = console.nextDouble();
        test3 = console.nextDouble();
        test4 = console.nextDouble();
        test5 = console.nextDouble();

        average = (test1 + test2 + test3 + test4 + test5) / 5;
        System.out.print("Your test scores are " + test1 + ", " + test2 + ", ");
        System.out.println(test3 + ", " + test4 + " and " + test5);
        System.out.println("Your average score is " + average);
    }
}
