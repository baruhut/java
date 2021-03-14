package chapter6;

public class Rectangle {

//    class should practise encapsulation.
//    ENCAPSULATION is one of key priciples OOP (that data/field of a class should private and methods/behaviour of the class can be exposed (public) to other class to use

    //    this is field or globar variable
    private double panjang;
    private double lebar;

    //    2. constructor. start with access modifier + not have return value bcz not a method + name HARUS SAMA DENGAN CLASS NAME
    public Rectangle() { //contructor tanpa param = default constructor yg isinya adalah nilai default sesuai body constructor
        panjang = 0;
        lebar = 0;
    }

    public Rectangle(double paramPanjang, double paramLebar) {
//        setPanjang(paramPanjang);
//        setLebar(paramLebar);
//        atau bisa ditulis dgn statement dibawah:
        this.panjang = paramPanjang;
        this.lebar = paramLebar;
    }

    //    1. getter & setter variable/field panjang dan lebar
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double paramPanjang) {
        this.panjang = paramPanjang;
    }

    double getLebar() {
        return lebar;
    }

    public void setLebar(double paramLebar) {
        this.lebar = paramLebar;
    }

    double hitungKeliling() {
        return (2 * panjang) + (2 * lebar);
    }

    double hitungLuas() {
        return (panjang * lebar);
    }

}
