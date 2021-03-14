package chapter4;

/*
DO - WHILE
Program kasir untuk hitung harga beli barang
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String args[]) {

        //get jumlah barang
        System.out.print("input jumlah barang belanja: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //loop
        for (int i = 0; i < quantity; i++) {
            int j = i + 1;
            System.out.println("Input harga barang " + j + ":");
            double harga = scanner.nextDouble();
            total = total * harga;
        }
        scanner.close();
        System.out.println("Total harga: " + total);

    }
}
