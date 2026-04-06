package Praktikum_2.Bagian4.Overloading;

public class Main {
    public satic void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil 1: " + kalkulator.tambah(5, 10)); //output: 15
        System.out.println("Hasil 2: " + kalkulator.tambah(5, 10, 15)); //output: 30
        System.out.println("Hasil : " + kalkulator.tambah(3.5, 2.5)); //output: 6.0
    }
}
