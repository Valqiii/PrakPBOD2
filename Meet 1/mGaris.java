public class mGaris {
    public static void main(String[] args) {
        //objek titik untuk garis pertama
        Titik titikAwal1 = new Titik(-1, -2);
        Titik titikAkhir1 = new Titik(-3, -4);

        //objek garis pertama
        Garis garis1 = new Garis(titikAwal1, titikAkhir1);

        //garis pertama
        garis1.printGaris();
        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());
        System.out.println("Titik tengah garis: (" + garis1.getTitikTengah().getAbsis() + ", " + garis1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + garis1.getPersamaanGaris());

        //objek titik untuk garis kedua
        Titik titikAwal2 = new Titik(1, 2);
        Titik titikAkhir2 = new Titik(3, 4);

        //objek garis kedua
        Garis garis2 = new Garis(titikAwal2, titikAkhir2);

        //garis kedua
        garis2.printGaris();
        System.out.println("Panjang garis: " + garis2.getPanjang());
        System.out.println("Gradien garis: " + garis2.getGradien());
        System.out.println("Titik tengah garis: (" + garis2.getTitikTengah().getAbsis() + ", " + garis2.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + garis2.getPersamaanGaris());

        //cek apakah garis1 sejajar dengan garis2
        System.out.println("Apakah garis 1 sejajar dengan garis 2: " +garis1.isSejajar(garis2));

        //cek apakah garis1 tegak lurus dengan garis2
        System.out.println("Apakah garis 1 tegak lurus dengan garis 2: " +garis1.isTegakLurus(garis2));

        //Menampilkan jumlah garis yang dibuat
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}