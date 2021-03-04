package chapter3;

public class Cobacoba {

    public static void main(String  args[]){

        System.out.println("test");
        Mobil m = new Mobil();
        Cobacoba c = new Cobacoba();
        c.isiMobil(m);

        String s= c.showMobil(m);
        System.out.println(s);

    }
    public Mobil getMobilData(Mobil m){
        //isi apa aja terkait data mobil
        return m;
    }

    public void isiMobil(Mobil m){

        m.setMerk("HYUNDAI");
        m.setTipemobil("SUV");
    }

    public String showMobil(Mobil m){
        String x = m.getMerk() +" "+ m.getTipemobil();
        return x;
    }

}
