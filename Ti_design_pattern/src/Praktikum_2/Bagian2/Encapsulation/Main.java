package Praktikum_2.Bagian2.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Budi");
        mhs1.setUmur(20);

        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("umur : " + mhs1.getUmur());
    }
}
