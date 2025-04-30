public class Main {
    public static void main(String[] args) {
        Anabul[] hewan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul a : hewan) {
            a.bersuara();
            a.bergerak();
            System.out.println();
        }
    }
}
