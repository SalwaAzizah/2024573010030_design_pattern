package Praktikum_1;

public class Latihan4 {
    public static void main(String[] args) {

        // ===== FOR =====
        System.out.println("Bilangan ganjil (for):");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        // ===== WHILE =====
        System.out.println("Bilangan ganjil (while):");
        int a = 1;
        while (a <= 20) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }

        System.out.println("\n");

        // ===== DO WHILE =====
        System.out.println("Bilangan ganjil (do-while):");
        int b = 1;
        do {
            if (b % 2 != 0) {
                System.out.print(b + " ");
            }
            b++;
        } while (b <= 20);

    }
}
