public class MataKuliah{
    private String idMatkul;
    private String Nama;
    private Integer SKS;

    public MataKuliah(){
        idMatkul = "";
        Nama = "";
        SKS = 0;
    }

    public MataKuliah(String idMatkul, String Nama, Integer SKS){
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    public String getidMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return Nama;
    }

    public Integer getSKS(){
        return SKS;
    }

    public void setidMatkul(String id){
        idMatkul = id;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setSKS(Integer SKS){
        this.SKS = SKS;
    }


}

