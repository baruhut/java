package chapter3;

import java.util.Scanner;

public class ChangeForRupiahGame {

    public static void main (String args[]){
        //value known
        int pecahan10 = 10;
        int pecahan20 = 20;
        int pecahan50 = 50;
        int pecahan100 = 200;

        //value unknown
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukan jumlah lembar uang 10.000:");
        int numOfPecahan10 = scanner.nextInt();

        System.out.println("masukan jumlah lembar uang 20.000:");
        int numOfPecahan20 = scanner.nextInt();

        System.out.println("masukan jumlah lembar uang 50.000:");
        int numOfPecahan50 = scanner.nextInt();
        scanner.close();

        //condition - output
        int totalEntry = (numOfPecahan10 * pecahan10) + (numOfPecahan20 * pecahan20) + (numOfPecahan50 * pecahan50);
        int total200 = Math.abs(totalEntry - pecahan100);

        if (totalEntry != pecahan100){
            System.out.println("jumlah uang yang anda masukan: Rp. " + totalEntry + ".000. Terdapat selisih: Rp. " + total200 + ".000. Tolong hitung kembali");
        }
        else {
            System.out.println("Terima kasih anda sudah masukan uang sejumlah Rp. 200.000");
        }


    }

}
