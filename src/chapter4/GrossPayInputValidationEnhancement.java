package chapter4;

/*
WHILE-LOOP
Program hitung gaji pokok mingguan (tidak ada lembur) karyawan toko
Tiap karyawan Rp. 1,5 Jt/jam
Tiap hari 8 jam * 5 hari/minggu
 */

import java.util.Scanner;

public class GrossPayInputValidationEnhancement {

    public static void main(String args[]) {

        //value known
        int rate = 150;
        int maxHours = 40;

        //value unknown
        System.out.println("Input berapa jam kerja minggu ini: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //proses - output
        while (hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("Invalid entry, masukan 1 - 40: ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double grossPay = rate * hoursWorked;
        System.out.println("Gross gaji adalah : $ " + grossPay + " terima kasih");

    }
}
