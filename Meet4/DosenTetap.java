// DosenTetap.java
// Deskripsi: Kelas untuk dosen tetap
// Pembuat: Muhammad Rifqi Avaldi
// Tanggal: 18 Maret 2025

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private final String NIDN;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    @Override
    public int hitungBUP(int batasUsia) {
        return super.hitungBUP(65); // BUP Dosen Tetap = 65 tahun
    }

    @Override
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja() * gajiPokok; // 2% x Masa Kerja x Gaji Pokok
    }

    @Override
    public void printInfo() {
        System.out.println("=== Dosen Tetap ===");
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("BUP: " + hitungBUP(65) + " tahun (Batas Usia Pensiun)");
    }
}

