public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(5);
        T1.setOrdinat(10);
        System.out.println("Titik T1: ");
        T1.printTitik();



        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        //set nilai langsung
        Titik T2 = new Titik(3,2);
        System.out.println("Titik T2: ");
        T2.printTitik();

        System.out.println("Titik T2 setelah di geser: ");
        T2.geser(1, 1);
        T2.printTitik();
        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("getKuadran T2: " + T2.getKuadran());
        System.out.println("getJarakPusat T2: " + T2.getJarakPusat());
        System.out.println("getJarak T2: " + T2.getJarak(T1));

        //Refleksi x dan y
        T2.refleksiX();
        T2.printTitik();
        T2.refleksiY();
        T2.printTitik();

        //getRefleksi x dan y
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();
        Titik T4 = T3.getRefleksiY();
        T4.printTitik();


    }
}
