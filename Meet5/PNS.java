//Nama: Muhammad Rifqi Avaldi
//NIM: 24060123140192
//Lab: D2

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    public PNS(){
        super();
        this.nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("NIP: %s%n", nip);
        System.out.printf("Pajak: Rp%,.2f%n", hitungPajak());
        System.out.println("----------------------------------------------");
    }

}
