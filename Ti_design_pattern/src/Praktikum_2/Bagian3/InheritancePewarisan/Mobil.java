package Praktikum_2.Bagian3.InheritancePewarisan;

public class Mobil extends Kendaraan {
    int jumlahPintu;


    void displayInfoMobil() {
        super.displayInfo(); // Memanggil metode dari superclass
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
