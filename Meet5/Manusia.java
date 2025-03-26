//Nama: Muhammad Rifqi Avaldi
//NIM: 24060123140192
//Lab: D2

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Manusia{
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMhs = 0;


    public Manusia(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0;
        counterMhs++;
    }

    public Manusia(String nama,LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMhs++;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
    }

    public static int getCounterMhs(){
        return counterMhs;
    }

    public void cetakInfo(){
        System.out.println("nama: " + nama);
        System.out.println("alamat: " + alamat);
        System.out.printf("Pendapatan: Rp%,.2f%n", pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }

}