// Tendik.java
// Deskripsi: Kelas untuk tenaga kependidikan
// Pembuat: Muhammad Rifqi Avaldi
// Tanggal: 18 Maret 2025

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private final String unitKerja;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String unitKerja) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.unitKerja = unitKerja;
    }

    @Override
    public int hitungBUP(int batasUsia) {
        return super.hitungBUP(55); // BUP Tendik = 55 tahun
    }

    @Override
    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * gajiPokok; // 1% x Masa Kerja x Gaji Pokok
    }

    @Override
    public void printInfo() {
        System.out.println("=== Tendik ===");
        super.printInfo();
        System.out.println("Unit Kerja: " + unitKerja);
        System.out.println("BUP: " + hitungBUP(55) + " tahun (Batas Usia Pensiun)");
    }
}


