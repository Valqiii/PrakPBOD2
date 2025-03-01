public class Kendaraan{
    private String noPlat, Jenis;

    public Kendaraan(){
        noPlat = "";
        Jenis = "";
    }

    public Kendaraan(String noPlat,String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    public String getnoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
}

