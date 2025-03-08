

public class ExceptionOnArray{
    public static void main(String[] args){
        // instansiasi objek array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // disini errornya !!!
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}

// Output: OutofBoundsException, karena panjangnya hanya dari 0-3 tetapi di input indeks sampai 4