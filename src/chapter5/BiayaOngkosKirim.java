package chapter5;

import java.util.Scanner;

/*
hitung biaya total ongkos kirim barang.
berat dibawah 1 - 3 kg dikenakan biaya 10000
diatas 3 kg biaya 5000 per kilo
untuk pelanggan member berlaku flat biaya kirim 20000
 */
public class BiayaOngkosKirim {

    static int beratMinimal = 3000;
    static int biayaMinimal = 10000;
    static int biayaTambahan = 5000;
    static int biayaKirimMember = 18000;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {

        //value unknown
        int varBerat = getBeratBarang();
        boolean varPelangganMember = getPelangganMember();
        scanner.close();

        //hitung selisih berat barang
        int varSelisihBerat = getSelisihBerat(varBerat);

        //hitung ongkos
        hitungOngkosKirim(varSelisihBerat, varPelangganMember);

    }

    public static int getBeratBarang() {
        System.out.println("Input berat barang (dalam gram):");
        int beratBarang = scanner.nextInt();
        return beratBarang;
    }

    public static boolean getPelangganMember() {
        System.out.println("Apakah pelanggan adalah member (true/false):");
        boolean tipePelanggan = scanner.nextBoolean();
        return tipePelanggan;

    }

    public static int getSelisihBerat(int paramBerat) {
        int selisihBerat;
        if (paramBerat > beratMinimal) {
            selisihBerat = (int) Math.ceil((paramBerat - beratMinimal) / 1000);
            return selisihBerat;
        } else {
            selisihBerat = 0;
            return selisihBerat;
        }
    }


    public static void hitungOngkosKirim(int paramSelisihBerat, boolean paramTipePelanggan) {
        if (paramTipePelanggan) {
            int totalBiayaKirim = biayaKirimMember;
            System.out.print(String.format("Ada tambahan %d Kg dari berat minimal. Berikut total yang harus dibayarkan untuk member: Rp. %d", paramSelisihBerat, totalBiayaKirim));
        } else {
            int totalBiayaKirim = biayaMinimal + (paramSelisihBerat * biayaTambahan);
            System.out.print(String.format("Ada tambahan %d Kg dari berat minimal. Berikut total yang harus dibayarkan untuk non member: Rp. %d", paramSelisihBerat, totalBiayaKirim));
        }

    }
}
