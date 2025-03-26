//Nama: Muhammad Rifqi Avaldi
//NIM: 24060123140192
//Lab: D2

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(){
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Pajak: " + hitungPajak());
        System.out.println("----------------------------------------------");
    }
}