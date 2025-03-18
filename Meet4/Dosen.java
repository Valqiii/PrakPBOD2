// Dosen.java
// Deskripsi: Kelas abstrak untuk dosen
// Pembuat: Muhammad Rifqi Avaldi
// Tanggal: 18 Maret 2025

import java.time.LocalDate;

class Dosen extends Pegawai {
    private final String fakultas;

    // Konstruktor dengan parameter
    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
