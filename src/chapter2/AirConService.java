package chapter2;

import java.util.Scanner;

public class AirConService {

    public static void main (String arg[]) {
        System.out.println("masukan nama pabrikan:");
        Scanner scanner = new Scanner(System.in);
        String merk = scanner.next();


        System.out.println("Masukan jumlah perbaikan");
        int number = scanner.nextInt();
        scanner.close();

        //biaya tiap service
        int charge = 10000;

        //total biaya service
        int bayar = charge * number;
        System.out.println("Perangkat AC dengan merk " + merk + " sudah " + number + " diperbaiki dengan total biaya perbaikan " + bayar);

        //Perangkat AC dengan merk [merk] sudah [number] diperbaiki dengan total [bayar]

    }
}
