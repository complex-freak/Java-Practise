package Chapter_Three;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;

public class Question_Seven {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("Ch3_ExData.txt"));
        PrintWriter outFile = new PrintWriter("Ch3_exOutput.dat");

        String firstName1, firstName2, firstName3, lastName1, lastName2, lastName3;
        double currentSalary1, currentSalary2, currentSalary3, percentPayIncrease1,
                percentPayIncrease2, percentPayIncrease3,  updatedSalary1, updatedSalary2, updatedSalary3;

        lastName1 = inFile.next();
        firstName1 = inFile.next();
        currentSalary1 = inFile.nextDouble();
        percentPayIncrease1 = inFile.nextDouble();
        updatedSalary1 = currentSalary1 + (currentSalary1 * (percentPayIncrease1 / 100));

        lastName2 = inFile.next();
        firstName2 = inFile.next();
        currentSalary2 = inFile.nextDouble();
        percentPayIncrease2 = inFile.nextDouble();
        updatedSalary2 = currentSalary2 + (currentSalary2 * (percentPayIncrease2 / 100));

        lastName3 = inFile.next();
        firstName3 = inFile.next();
        currentSalary3 = inFile.nextDouble();
        percentPayIncrease3 = inFile.nextDouble();
        updatedSalary3 = currentSalary3 + (currentSalary3 * (percentPayIncrease3 / 100));

        outFile.printf("Firstname  Lastname  Updated_salary%n");
        outFile.printf("%-9s  %-8s  $ %8.2f%n", firstName1, lastName1 , updatedSalary1);
        outFile.printf("%-9s  %-8s  $ %8.2f%n", firstName2, lastName2 , updatedSalary2);
        outFile.printf("%-9s  %-8s  $ %8.2f%n", firstName3, lastName3 , updatedSalary3);

        outFile.close();
    }
}
