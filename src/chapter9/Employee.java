package chapter9;

public class Employee extends Person {

    private String nomorKaryawan;
    private String jabatan;

    public Employee() {
        super("Angie");
//        super();
        System.out.println("In Employee default constructor..." + usia);
    }

    public String getNomorKaryawan() {
        return nomorKaryawan;
    }

    public void setNomorKaryawan(String nomorKaryawan) {
        this.nomorKaryawan = nomorKaryawan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void print() {
        System.out.println("print jabatan " + jabatan);
        System.out.println("print name " + getNama());
    }
}
