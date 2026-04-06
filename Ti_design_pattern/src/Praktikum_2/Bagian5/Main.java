package Praktikum_2.Bagian5;

public class Main {

    // Interface
    interface Terbang {
        void terbang();
    }

    // Abstract Class
    abstract static class Hewan {
        String nama;

        abstract void bersuara();
    }

    // Class yang mewarisi abstract class dan mengimplementasikan interface
    static class Burung extends Hewan implements Terbang {

        @Override
        void bersuara() {
            System.out.println("Kicau kicau");
        }

        @Override
        public void terbang() {
            System.out.println(nama + " sedang terbang.");
        }
    }

    public static void main(String[] args) {
        Burung burung = new Burung();

        burung.nama = "Merpati";

        burung.bersuara();
        burung.terbang();
    }
}