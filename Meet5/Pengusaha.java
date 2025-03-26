//Nama: Muhammad Rifqi Avaldi
//NIM: 24060123140192
//Lab: D2

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(){
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Pajak: " + hitungPajak());
        System.out.println("----------------------------------------------");
    }
}
