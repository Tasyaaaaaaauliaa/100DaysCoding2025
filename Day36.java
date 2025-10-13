package day36;
import java.util.Scanner;

public class day36 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = x.nextInt();

        if (angka >= 50) {
            if (angka >= 90) {
                System.out.println("Angka sangat besar");
            } else {
                System.out.println("Angka besar");
            }
        } else {
            System.out.println("Angka kecil");
        }
    }
}
