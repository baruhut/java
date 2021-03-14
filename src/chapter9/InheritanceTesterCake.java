package chapter9;

public class InheritanceTesterCake {

    public static void main(String[] args) {
        Cake cake = new Cake("chocolate");
        cake.setHarga(29.99);
        System.out.println("Cake flavor: " + cake.getRasa());
        System.out.println("Cake price: " + cake.getHarga());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setHarga(49.95);
        System.out.println("Birthday cake flavor: " + birthdayCake.getRasa());
        System.out.println("Birthday cake price: " + birthdayCake.getHarga());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setRasa("pina colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getRasa());
        System.out.println("Wedding cake price: " + weddingCake.getHarga());

    }
}
