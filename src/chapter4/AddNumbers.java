package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]) {

        boolean again = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input angka pertama: ");
            int num1 = scanner.nextInt();

            System.out.print("Input angka kedua  : ");
            int num2 = scanner.nextInt();

            int addNum = num1 + num2;

            System.out.println("Total penjumlahan adalah " + addNum);
            System.out.println("Mau mengulang hitungan? (true or false)");
            again = scanner.nextBoolean();

        } while (again);
        scanner.close();
    }
}
