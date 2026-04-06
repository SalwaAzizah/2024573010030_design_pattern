package Praktikum_2.Bagian2.Latihan;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();

        motor1.setMerk("Honda");
        motor1.setTahun(2023);

        System.out.println("Merk: " + motor1.getMerk());
        System.out.println("Tahun: " + motor1.getTahun());
    }
}
