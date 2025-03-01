public class MMahasiswa {
    public static void main(String[] args) {
            MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
            MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
            Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
            Dosen D1 = new Dosen("123", "Andi", "Informatika");
            Kendaraan K1 = new Kendaraan("H1234AB", "Motor");


            MataKuliah ASA = new MataKuliah("ASA", "Analisis dan Strategi ALgoritma", 3);
            MataKuliah SISCER = new MataKuliah("SISCER", "Sistem Cerdas", 3);
            Mahasiswa M2 = new Mahasiswa("235", "Thodos", "Informatika");
            Dosen D2 = new Dosen("145", "Judas", "Informatika");
            Kendaraan K2 = new Kendaraan("AB4534F", "Mobil");
    
            M1.setDoswal(D1);
            M1.setKendaraan(K1);
            M1.addMatKul(PBO);
            M1.addMatKul(MBD);


            M1.printDetailMhs();
            System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
            System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

            System.out.println();

            M2.setDoswal(D2);
            M2.setKendaraan(K2);
            M2.addMatKul(SISCER);
            M2.addMatKul(ASA);

            M2.printDetailMhs();
            System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
            System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
        
    }
}