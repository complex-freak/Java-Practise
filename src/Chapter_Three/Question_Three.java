package Chapter_Three;

import java.util.Scanner;
import java.io.*;

public class Question_Three {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("inTicketSales.txt"));
        PrintWriter outFile = new PrintWriter("outTicketSales.txt");

        int boxTickets, boxPrice, sidelineTickets, sidelinePrice, premiumTickets,
                premiumPrice, generalTickets, generalPrice, totalTickets;
        double sales;
        String headers;

        headers = inFile.nextLine();
        boxPrice = inFile.nextInt();
        boxTickets = inFile.nextInt();
        sidelinePrice = inFile.nextInt();
        sidelineTickets = inFile.nextInt();
        premiumPrice = inFile.nextInt();
        premiumTickets = inFile.nextInt();
        generalPrice = inFile.nextInt();
        generalTickets = inFile.nextInt();

        totalTickets = boxTickets + sidelineTickets + premiumTickets + generalTickets;
        sales = (boxTickets * boxPrice) + (sidelineTickets * sidelinePrice) +
                (premiumTickets * premiumPrice) + (generalPrice * generalPrice);

        outFile.printf("Total tickets sold are %d%nTotal sales is $%.2f", totalTickets, sales);

        inFile.close();
        outFile.close();
    }
}
