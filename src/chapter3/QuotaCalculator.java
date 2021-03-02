package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String arg[]) {

        //init value we know
        int quota = 10;

        //get value unknown
        System.out.println("Berapa penjualan minggu ini:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //condition and output
        if (sales >= quota) {
            System.out.println("Congratulation");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("Anda tidak memenuhi target penjualan. kurang " + salesShort + " dari target penjualan");
        }

    }

}
