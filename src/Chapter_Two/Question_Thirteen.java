package Chapter_Two;
import java.util.Scanner;

public class Question_Thirteen {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int hours, minutes, seconds, totalSeconds;

        System.out.print("Enter elapsed hours: ");
        hours = console.nextInt();
        System.out.print("Enter elapsed minutes: ");
        minutes = console.nextInt();
        System.out.print("Enter elapsed seconds: ");
        seconds = console.nextInt();

        totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Elapsed time: " + totalSeconds + " seconds.");
    }
}
