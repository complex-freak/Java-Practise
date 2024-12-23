package Chapter_Two;
import java.util.Scanner;

public class Question_Twelve {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int seconds, minutes, hours;

        System.out.print("Enter elapsed time in seconds: ");
        seconds = console.nextInt();

        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds %= 60;

        System.out.println("Elapsed time: " + hours + ":" + minutes + ":" + seconds);

    }
}
