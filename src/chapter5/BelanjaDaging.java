package chapter5;

/*
Belanja Daging
Menghitung total belajna berbagai jenis daging (Ayam, kambing, sapi, babi, ikan)
Biaya potong dan membersihkan Rp. 10.000
Harga Bumbu Rp. 15.000
 */

import java.util.Scanner;

public class BelanjaDaging {

    static Scanner scanner = new Scanner(System.in);
    static int hargaAyam = 10001;
    static int hargaKambing = 20011;
    static int hargaSapi = 60111;

    public static void main(String args[]) {
        //value unknown
        int varJumlahJenisDaging = getJumlahJenisDaging();


        //process - output
        int totalHargaBelanja = 0;
        for (int j = 0; j < varJumlahJenisDaging; j++) {
            int varHargaBelanja = countHargaBelanja();
            totalHargaBelanja = totalHargaBelanja + varHargaBelanja;
        }
        System.out.println("harga belanja: " + totalHargaBelanja);
        scanner.close();
    }

    public static int getJumlahJenisDaging() {
        System.out.println("Masukan jumlah jenis daging (1 - 3):");
        int jumlahJenisDaging = scanner.nextInt();
        return jumlahJenisDaging;
    }

    public static int getJenisDaging() {
        System.out.println("Masukan jenis daging (1. Ayam / 2. Kambing / 3. Sapi): ");
        int jenisDaging = scanner.nextInt();
        return jenisDaging;
    }

    public static int getBeratDaging() {
        System.out.println("Masukan berat daging yang dibeli (kilogram): ");
        int beratDaging = scanner.nextInt();
        return beratDaging;
    }

    public static int countHargaBelanja() {
        int hargaDaging = 0;
        int varJenisDaging = getJenisDaging();
        if (varJenisDaging == 1) {
            hargaDaging = hargaAyam;
        } else if (varJenisDaging == 2) {
            hargaDaging = hargaKambing;
        } else if (varJenisDaging == 3) {
            hargaDaging = hargaSapi;
        } else {
            System.out.println("Input salah");
        }
        int varBeratDaging = getBeratDaging();
        int hargaBelanja = varBeratDaging * hargaDaging;
        return hargaBelanja;

    }

}
