package chapter6;

/*
ada biayaKirimUmum
ada biayaKirimMember
ada biayaKirimMemberKhusus untuk member yang punya data beratMinimalKhusus, data biayaMinimalKhusus, biayaTambahanKhusus
 */

public class BiayaOngkosKirim {
    private int id;
    private double beratMinimal;
    private double biayaMinimal = 10000;
    private double biayaPerKilo = 10000;
    private double beratBarang;

    public BiayaOngkosKirim() {
        id = 0;
        beratMinimal = 3000;
        this.biayaMinimal = 5000;
        biayaPerKilo = 9000;
    }


    public BiayaOngkosKirim(int paramId) {
        this.id = paramId;
        beratMinimal = 3000;
    }

    public void setBeratBarang(int paramBerat) {
        beratBarang = paramBerat;
    }

    public double hitungSelisihBerat() {
        if (beratBarang <= beratMinimal)
            return 0;
        else {
            return (int) Math.ceil((beratBarang - beratMinimal) / 1000);
        }
    }

    public double hitungOngkosKirim() {
        return (hitungSelisihBerat() * biayaPerKilo) + biayaMinimal;
    }

    public void printBiayaOngkosKirim() {
        System.out.println("ID: " + id);
        System.out.println("Kelebihan berat barang (kg): " + hitungSelisihBerat());
        System.out.println("Biaya Kirim: " + hitungOngkosKirim());
    }
}
