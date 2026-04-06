package Praktikum_2.Bagian6;

public class TiketVip extends Tiket {

    public TiketVip() {
        super("VIP", 250000); // Harga tiket VIP
    }

    @Override
    public double hitungDiskon() {
        return 0.1 * getHarga(); // Diskon 10%
    }
}