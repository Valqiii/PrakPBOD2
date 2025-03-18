// DosenTamu.java
// Deskripsi: Kelas untuk dosen tamu
// Pembuat: Muhammad Rifqi Avaldi
// Tanggal: 18 Maret 2025

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private final String NIDK;
    private final LocalDate kontrakHabis;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate kontrakHabis) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakHabis = kontrakHabis;
    }

    @Override
    public double hitungTunjangan() {
        return 0.025 * gajiPokok; // 2.5% x Gaji Pokok
    }

    @Override
    public void printInfo() {
        System.out.println("=== Dosen Tamu ===");
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Kontrak Habis: " + kontrakHabis);
    }
}

