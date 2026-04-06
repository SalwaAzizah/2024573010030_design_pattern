package Praktikum_2.Bagian4.Overriding;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); // Polymorphim
        Hewan hewan2 = new Anjing(); // Polymorphim

     hewan1.bersuara(); // Output: Meong!
     hewan2.bersuara(); // Output: Guk Guk!
    }
}
