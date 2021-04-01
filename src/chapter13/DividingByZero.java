package chapter13;

public class DividingByZero {

    public static void main(String[] args) {
        dividingByZero();
    }

    private static void dividingByZero() {
        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("dividing with zero is not allowed");
        } finally {
            System.out.println("dividing is fun");
        }

//        System.out.println(c);
    }
}
