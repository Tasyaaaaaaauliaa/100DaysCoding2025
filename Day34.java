package day34;
import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner (System.in);
        System.out.println("masukan nilai a : ");
        int a = x.nextInt();
        System.out.println("masukan nilai b : ");
        int b = x.nextInt();
        System.out.println("masukan nilai c : ");
        int c = x.nextInt();
        //operator incremen
        b++;
        System.out.println("nilai hasil setelah incremen : "+ b);
        //operator penugasan
        a += 2;
        System.out.println("nilai operator penugasan : "+ a);
        //operator aritmatika
        int hasil = (a * b + c);
        System.out.println("hasil operator penjumlahan : "+ hasil);
        //operator perbandingan dan logika
        boolean hasil2 = (hasil > 10) && (a < b);
        System.out.println("hasil perbandingan dan logika : "+ hasil2);
        
    }
    
}
