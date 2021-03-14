package chapter9;

public class Person {

    private String nama;
    private int usia;
    private String jenisKelamin;

    //    public Person() {
//        System.out.println("In Person default constructor...");
//    }
//
    public Person(String nama) {
        System.out.println("In Person 2nd constructor. Name is set..");
    }
//

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }


}
