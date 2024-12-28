package Chapter_Four;

import java.util.Scanner;

public class Question_5 {
    static final int COOKIES_PER_BOX = 24;
    static final int BOXES_PER_CONTAINER = 75;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cookies, boxes, containers, leftOverCookies, leftOverBoxes;

        System.out.print("Enter the total number of cookies:");
        cookies = console.nextInt();

        boxes = cookies / COOKIES_PER_BOX;
        containers = boxes / BOXES_PER_CONTAINER;

        leftOverCookies = cookies % COOKIES_PER_BOX;
        leftOverBoxes = boxes % BOXES_PER_CONTAINER;

        System.out.printf("The requires number of boxes for %d cookies is %d boxes.%n", cookies, boxes);
        System.out.printf("The required number of containers to ship cookies is %d containers.%n", containers);

        if (leftOverCookies > 0)
            System.out.println("Leftover cookies: " + leftOverCookies);

        if (leftOverBoxes > 0)
            System.out.println("Leftover boxes: " + leftOverBoxes);
    }
}
