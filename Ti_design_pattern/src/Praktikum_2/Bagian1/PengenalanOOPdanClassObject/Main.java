package Praktikum_2.Bagian1.PengenalanOOPdanClassObject;

public class Main {
    public static void main(String[] args) {
        // Mwmbuat objek
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.umur = 20;

        // Memanggil metode
        mhs1.displayInfo();
    }
}
