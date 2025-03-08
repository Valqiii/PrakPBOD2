

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}

// baris 12 pada AngkaSial.java dieksekusi sekali di as.cobaAngka(10) dan setelahnya tidak di eksekusi lagi
// baris 21 yaitu catch akan dijalankan saat as.cobaAngka(13) di eksekusi, karena merupakan angka yang masuk ke dalam exception.