package Day50;
import java.util.Scanner;
public class day50 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        
        System.out.println("masukan nilai");
        int angka = x.nextInt();
        
        String hasil = (angka %2 == 0)? "GENAP" : "GANJIL";
        System.out.println("Angka tersebut adalah "+ hasil);
    }
    
}
