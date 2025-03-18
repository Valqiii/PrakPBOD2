// Main.java
// Deskripsi: Program utama untuk menguji semua kelas pegawai
// Pembuat: Muhammad Rifqi Avaldi
// Tanggal: 18 Maret 2025

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", "123456789", "Andi", LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika"
        );

        DosenTamu dosenTamu = new DosenTamu(
            "9545647549", "987654321", "Budi", LocalDate.of(1985, 3, 15), 
            LocalDate.of(2018, 6, 10), 4500000, "Fakultas Teknik", 
            LocalDate.of(2026, 12, 31)
        );

        Tendik tendik = new Tendik(
            "9545647550", "Citra", LocalDate.of(1980, 7, 20), 
            LocalDate.of(2010, 9, 1), 4000000, "Kemahasiswaan"
        );

        dosenTetap.printInfo();
        System.out.println();

        dosenTamu.printInfo();
        System.out.println();

        tendik.printInfo();
    }
}


