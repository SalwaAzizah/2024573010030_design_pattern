package Praktikum_2.Bagian6;

public class TiketReguler extends Tiket {

    public TiketReguler() {
        super("Reguler", 100000); // Harga tiket reguler
    }

    @Override
    public double hitungDiskon() {
        return 0; // Tidak ada diskon
    }
}