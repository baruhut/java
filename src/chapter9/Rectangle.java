package chapter9;

public class Rectangle {

    protected static int panjang;
    protected static int lebar;
    protected static int sisi = 4;

    public static int getPanjang() {
        return panjang;
    }

    public static void setPanjang(int panjang) {
        Rectangle.panjang = panjang;
    }

    public static int getLebar() {
        return lebar;
    }

    public static void setLebar(int lebar) {
        Rectangle.lebar = lebar;
    }

    public static int getSisi() {
        return sisi;
    }

    public static void setSisi(int sisi) {
        Rectangle.sisi = sisi;
    }

    public double hitungKeliling() {
        return (2 * panjang) + (2 * lebar);
    }

    public void print() {
        System.out.println("This is rectangle");
    }
}
