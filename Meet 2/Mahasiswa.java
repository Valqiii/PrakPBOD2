import java.util.ArrayList;

public class Mahasiswa {

/***************ATRIBUT***************/
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahmatkul;

/***************METHOD***************/

// Konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa(){
        NIM = "";
        Nama = "";
        Prodi = "";
        listMatKul = new ArrayList<>(); // Inisialisasi ArrayList kosong
        jumlahmatkul = 0;
    }

    public Mahasiswa(String NIM,String Nama,String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatKul = new ArrayList<>(50);
        this.jumlahmatkul = 0;

    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public Dosen getDosen(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public int getJumlahMatKul(){
        return jumlahmatkul;
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah mk : listMatKul) { 
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;        
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public void setDoswal(Dosen doswal){
        dosenWali = doswal;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
        jumlahmatkul++;
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
        int i;
        for(i=0; i<listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getnoPlat() + " (" + kendaraan.getJenis() + ")");
        }
    }
}
// end class Mahasiswa


