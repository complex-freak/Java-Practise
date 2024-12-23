package Chapter_Two;

import java.util.Scanner;

public class Question_Nineteen {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String str1, str2, str3;

        System.out.print("Enter the first string: ");
        str1 = console.nextLine();
        System.out.print("Enter the second string: ");
        str2 = console.nextLine();
        System.out.print("Enter the third string: ");
        str3 = console.nextLine();
        System.out.println();

        System.out.println("The permutation are :");
        System.out.println(str1 + " " + str2 + " " + str3);
        System.out.println(str1 + " " + str3 + " " + str2);
        System.out.println(str2 + " " + str1 + " " + str3);
        System.out.println(str2 + " " + str3 + " " + str2);
        System.out.println(str3 + " " + str1 + " " + str2);
        System.out.println(str3 + " " + str2 + " " + str1);

    }
}
