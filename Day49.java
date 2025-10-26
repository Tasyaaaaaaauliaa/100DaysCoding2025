package day49;
import java.util.Scanner;
public class day49 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("masukan nilai");
        int angka = x.nextInt();
        
        String hasil = (angka > 0)? "POSITIF" : "NEGATIF";
        System.out.println("Angka : "+ hasil);
    }
    
}
