package chapter9;

public class Square extends Rectangle {

    @Override
    public double hitungKeliling() {
        return sisi * panjang;
    }

    public void print(String what) {
        System.out.println("this is " + what);
    }
}


