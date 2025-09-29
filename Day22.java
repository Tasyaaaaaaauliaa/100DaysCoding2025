package day22;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        
        System.out.print("Masukan panjang persegi : ");
        double sisi = l.nextDouble();
        
        double luas = sisi * sisi;
        
        System.out.print("luas persegi dengan sisi " + sisi +"adalah" + luas);
        
    }
    
} 
