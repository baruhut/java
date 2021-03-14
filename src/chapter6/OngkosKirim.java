package chapter6;

public class OngkosKirim {

    public static void main(String args[]) {

        BiayaOngkosKirim ongkosKirim1 = new BiayaOngkosKirim(342);
        ongkosKirim1.setBeratBarang(2000);
        ongkosKirim1.printBiayaOngkosKirim();

        BiayaOngkosKirim ongkosKirim2 = new BiayaOngkosKirim();
        ongkosKirim2.setBeratBarang(2000);
        ongkosKirim2.printBiayaOngkosKirim();

        BiayaOngkosKirim ongkosKirim3 = new BiayaOngkosKirim(343);
        ongkosKirim3.setBeratBarang(2000);
        ongkosKirim3.printBiayaOngkosKirim();
    }
}
