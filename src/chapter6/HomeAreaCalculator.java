package chapter6;

/*
write a class that create instances of Rectangle object/class to find total area of two rooms
 */
public class HomeAreaCalculator {

    public static void main(String args[]) {

        //Rectangle # 1
        Rectangle ruang1 = new Rectangle();
        ruang1.setPanjang(50);
        ruang1.setLebar(25);
        double areaRuang1 = ruang1.hitungLuas();

        //Rectangle # 2
        Rectangle ruang2 = new Rectangle(30, 75);
        double areaRuang2 = ruang2.hitungLuas();

        double totalArea = areaRuang1 + areaRuang2;
        System.out.println("Luar kedua ruangan adalah: " + totalArea);

    }
}
