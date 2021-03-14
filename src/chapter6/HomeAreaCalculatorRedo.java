package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        HomeAreaCalculatorRedo calculatorRuangan = new HomeAreaCalculatorRedo();
//        Rectangle kitchen = calculatorRuangan.getRoom();
        Rectangle kitchen = new HomeAreaCalculatorRedo().getRoom();
        Rectangle bathroom = calculatorRuangan.getRoom();

        calculatorRuangan.scanner.close();


        double luasRuangan = calculatorRuangan.hitungTotalRuangan(kitchen, bathroom);
        System.out.println("Total luas ruangan adalah: " + luasRuangan);
    }

    public Rectangle getRoom() {
        System.out.println("Enter panjang of your room: ");
        double panjang = scanner.nextDouble();

        System.out.println("Enter lebar of your room: ");
        double lebar = scanner.nextDouble();

        /*Rectangle room = new Rectangle(panjang, lebar)
        scanner.close();
        return room;*/
//        atau bisa ditulis:

        return new Rectangle(panjang, lebar);
    }

    public double hitungTotalRuangan(Rectangle paramRect1, Rectangle paramRect2) {
        return paramRect1.hitungLuas() + paramRect2.hitungLuas();
    }
}
