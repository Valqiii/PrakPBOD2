

public class Asersi1{
    public static void main(String[] args){
        int x = 0; //disini errornya !!!
        if(x>0){
            System.out.println("x bilangan positif");
        } else {
            assert (x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

//outputnya : Assertion Error "Ada Kesalahan Kode"