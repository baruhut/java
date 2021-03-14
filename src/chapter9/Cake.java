package chapter9;

public class Cake {

    protected static String rasa;
    protected static double harga;

    public Cake(String flavor) {
        setRasa(flavor);
        setHarga(9.99);
    }

    public static String getRasa() {
        return rasa;
    }

    public static void setRasa(String rasa) {
        Cake.rasa = rasa;
    }

    public static double getHarga() {
        return harga;
    }

    public static void setHarga(double harga) {
        Cake.harga = harga;
    }


}
