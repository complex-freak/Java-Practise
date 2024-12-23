package Chapter_Three;

import java.util.Scanner;

public class Question_Eigth {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double mass, density, volume;

        System.out.print("Enter mass(in grams): ");
        mass = console.nextDouble();
        System.out.print("Enter density(in grams per cubic centimeter): ");
        density = console.nextDouble();
        System.out.println();

        volume = mass / density;

        System.out.printf("Volume is %.2f cubic centimeter", volume);
    }
}
