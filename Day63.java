package day63;
import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
    Scanner x = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int angka = x.nextInt();
        int hasil = 1;
        
        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
             hasil *= i ;
        }
       
        System.out.println("hasil : " + hasil);
    }
    
    }
