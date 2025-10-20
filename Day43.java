package day43;
import java.util.Scanner;
public class day43 {
    
    public static void main(String[] args) {
        //Latihan: Program Kelipatan 3,5, 3 dan 5
        
        Scanner x = new Scanner(System.in);
        System.out.print("Masuakan angka");
        int angka = x.nextInt();
        
        if (angka % 3 == 0 && angka %5 == 0){
            System.out.println("angka tersebut kelipatan 3 dan 5");
        } else if (angka % 3 == 0){
            System.out.println("angka tersebut kelipatan 3");
        } else if (angka % 5 == 0){
            System.out.println("angka tersebut kelipatan 5");
        } else {
            System.out.println("angka bukan kelipatan 3 ataupun 5");
    
        }
    }
    
}
