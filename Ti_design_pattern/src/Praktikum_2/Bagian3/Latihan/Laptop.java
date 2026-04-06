package Praktikum_2.Bagian3.Latihan;

public class Laptop {
        Processor processor;
        RAM ram;

        Laptop() {
            processor = new Processor();
            ram = new RAM();
        }

        void nyalakanLaptop() {
            System.out.println("Laptop dinyalakan.");
            processor.jalankan();
            ram.baca();
            ram.tulis();
        }
    }

