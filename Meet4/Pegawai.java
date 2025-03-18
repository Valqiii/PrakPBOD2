// Pegawai.java
// Deskripsi: Kelas dasar untuk semua pegawai
// Pembuat: Muhammad Rifqi Avaldi
// Tanggal: 18 Maret 2025

import java.time.LocalDate;

public class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    public Pegawai() {
        this.NIP = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.TMT = LocalDate.now();
        this.gajiPokok = 0;
    }

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate tanggal) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return tanggal.getDayOfMonth() + " " + namaBulan[tanggal.getMonthValue() - 1] + " " + tanggal.getYear();
    }

    public int hitungMasaKerja() {
        return LocalDate.now().getYear() - TMT.getYear();
    }

    public int hitungBUP(int batasUsia) {
        return tanggalLahir.getYear() + batasUsia;
    }

    public double hitungTunjangan() {
        return 0;
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(TMT));
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Gaji Pokok: Rp" + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", hitungTunjangan()));
    }
}
