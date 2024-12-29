import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] list = new double[5];

//        System.out.print("Enter a list of numbers: ");
//        for (int i = 0; i < 5; i++) {
//            list[i] = input.nextDouble();
//        }
//        System.out.println();
//
//        System.out.println(largest(list));
//        System.out.println(largest(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        twoDim();
        vectorExample();
    }

    public static double largest(double ...numList) {
        double max = numList[0];

        for (double num : numList) {
            if (max < num) {
                max = num;
            }
        }

        return max;

    }

    public static void twoDim() {
        int[][] table = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static  void vectorExample() {
        Vector<String> stringList = new Vector<String>();
        Vector<Integer> list = new Vector<Integer>();

        stringList.addElement("Moses Ngunga");
        stringList.addElement("Sarafina Ngunga");
        stringList.addElement("Clara Ngunga");
        stringList.addElement("Krista Ngunga");

        list.addElement(25);
        list.add(22);
        list.addElement(62);
        list.addElement(70);
        list.addElement(93);

        System.out.println(stringList);
        System.out.println(list);

        list.removeElement(62);
        System.out.println(list);
    }
}