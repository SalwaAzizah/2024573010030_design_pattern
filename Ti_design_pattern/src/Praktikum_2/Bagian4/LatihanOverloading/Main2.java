package Praktikum_2.Bagian4.LatihanOverloading;

public class Main2 {
    public static void main(String[] args) {
        Matematika math = new Matematika();

        System.out.println("2 int: " + math.tambah(5, 3));
        System.out.println("3 int: " + math.tambah(5, 3, 2));
        System.out.println("2 double: " + math.tambah(2.5, 3.5));
    }
}

