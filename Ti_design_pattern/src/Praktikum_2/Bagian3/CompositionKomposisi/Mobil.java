package Praktikum_2.Bagian3.CompositionKomposisi;

public class Mobil {
    private final Mesin mesin; // Composition

    public Mobil() {
        this.mesin = new Mesin();
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan. ");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti. ");
    }
}
