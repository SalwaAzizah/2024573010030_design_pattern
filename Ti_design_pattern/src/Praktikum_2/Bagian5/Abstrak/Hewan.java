package Praktikum_2.Bagian5.Abstrak;

public abstract class Hewan {
    // Atribut
    String nama;

    // Method konkret
    void makan() {
        System.out.println(nama + "sedang makan. ");
    }

    // Method abstrak
    abstract void bersuara();
}
