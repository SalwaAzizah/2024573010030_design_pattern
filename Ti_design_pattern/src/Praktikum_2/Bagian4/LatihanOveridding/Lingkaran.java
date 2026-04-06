package Praktikum_2.Bagian4.LatihanOveridding;

    public class Lingkaran extends BangunDatar {
        int jariJari;

        Lingkaran(int jariJari) {
            this.jariJari = jariJari;
        }

        @Override
        double hitungLuas() {
            return 3.14 * jariJari * jariJari;
        }
    }

