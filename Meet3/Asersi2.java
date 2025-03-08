

//class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0; //disini errornya !!!
        assert(jariJari > 0) : "jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// Output: Assertion Error "jari jari tidak boleh nol !!!" 
// Kesalahan konsep pada kode diatas yang dimaksud yaitu karena nilai jari jari yang di input 0,
// yang dimana jari jari valuenya tidak boleh 0 karena akan menyebabkan error yang tidak berujung sehingga saat code di run akan tidak jalan(stuck).
// oleh karena itu dibuatlah assertion error untuk menangkal code saat di run sehingga tidak stuck seperti sebelumnya.