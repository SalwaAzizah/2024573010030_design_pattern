package Praktikum_2.Bagian4.LatihanOveridding;

    public class Persegi extends BangunDatar {
        int sisi;

        Persegi(int sisi) {
            this.sisi = sisi;
        }

        @Override
        double hitungLuas() {
            return sisi * sisi;
        }
    }

