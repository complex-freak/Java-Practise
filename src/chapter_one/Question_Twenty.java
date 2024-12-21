package chapter_one;

import java.util.Scanner;

public class Question_Twenty {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double  room_length, room_width, room_height, door_height, door_width, shelf_height, shelf_width,
                wind_height, wind_width, floor_area, door_area, wind_area, shelf_area, wall_area,
                painting_cost_per_sqrft, carpet_cost_per_sqrft, total_carpet_installation_cost, total_painting_cost;

        System.out.println("Enter the dimensions of the room in feet:");
        System.out.print("Rooms height: ");
        room_height = console.nextDouble();
        System.out.print("Rooms length: ");
        room_length = console.nextDouble();
        System.out.print("Rooms width: ");
        room_width = console.nextDouble();
        System.out.println();

        System.out.println("Enter the dimensions of the door in feet:");
        System.out.print("Door height: ");
        door_height= console.nextDouble();
        System.out.print("Door width: ");
        door_width = console.nextDouble();
        System.out.println();

        System.out.println("Enter the dimensions of the window in feet:");
        System.out.print("Window height: ");
        wind_height= console.nextDouble();
        System.out.print("Window width: ");
        wind_width = console.nextDouble();
        System.out.println();

        System.out.println("Enter the dimensions of the shelf in feet:");
        System.out.print("Bookshelf height: ");
        shelf_height= console.nextDouble();
        System.out.print("Bookshelf width: ");
        shelf_width = console.nextDouble();
        System.out.println();

        System.out.print("Enter the cost, per square foot, of painting the walls: ");
        painting_cost_per_sqrft = console.nextDouble();
        System.out.print("Enter the cost, per square foot, of installing carpet: ");
        carpet_cost_per_sqrft = console.nextDouble();
        System.out.println();

        floor_area = room_length * room_width;
        total_carpet_installation_cost = floor_area * carpet_cost_per_sqrft;

        door_area = door_height * door_width;
        wind_area = wind_height * wind_width;
        shelf_area = shelf_height * shelf_width;
        wall_area = (room_height * room_length * 2) + (room_height * room_width * 2);
        total_painting_cost = (wall_area - door_area - (wind_area * 2) - shelf_area) * painting_cost_per_sqrft;

        System.out.println("The cost of painting walls is $" + total_painting_cost);
        System.out.println("The cost of installing carpet is $" + total_carpet_installation_cost);
    }
}
